package Day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part1 {

    public static void main(String[] args) {
//        List<String> input = List.of("Time:      7  15   30","Distance:  9  40  200");
//        e.g. 4*8*9 = 288
    List<String> input = List.of("Time:        40     82     91     66", "Distance:   277   1338   1349   1063");

        List<RaceInfo> raceInfoList = parse(input);
        System.out.println(raceInfoList);
        List<Integer> waysToBeatRaceNum = new ArrayList<>();
        for (RaceInfo raceInfo : raceInfoList) {
            waysToBeatRaceNum.add(waysToBeatRace(raceInfo));
        }
        var result = waysToBeatRaceNum.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Result = " + result);
    }

    private static int waysToBeatRace(RaceInfo raceInfo) {
        int result = 0;
        for (int i = 0; i < raceInfo.duration; i++) {
            int leftoverTime = raceInfo.duration - i; // hold for i seconds
            int distance = i * leftoverTime;
            System.out.println("Hold for " + i + " seconds. Leftover time = " + leftoverTime + ". Traveled for " + distance + " mm. Should travel " + raceInfo.distance + " mm.");
            if (distance >= raceInfo.distance) {
                result++;
            }
        }
        System.out.println(raceInfo.id + ")Result = " + result);
        return result;
    }

    private static List<RaceInfo> parse(List<String> input) {
        List<RaceInfo> result = new ArrayList<>();
        if (input.size() != 2) {
            System.err.println("Invalid input");
            return result;
        }
        List<String> times = parseLine(input.get(0));
        List<String> distances = parseLine(input.get(1));
        if (times.size() != distances.size()) {
            System.err.println("Invalid input parsing");
            return result;
        }
        for (int i = 0; i < times.size(); i++) {
            result.add(new RaceInfo(i + 1, Integer.parseInt(times.get(i)), Integer.parseInt(distances.get(i))));
        }
        return result;
    }

    private static List<String> parseLine(String s) {
        return Arrays.stream(s.split(":")[1].trim().split("\\s")).filter(i -> !i.isBlank()).toList();
    }

    public static class RaceInfo {
        int id;
        int duration;
        int distance;

        public RaceInfo(int id, int duration, int distance) {
            this.id = id;
            this.duration = duration;
            this.distance = distance;
        }

        @Override
        public String toString() {
            return "RaceInfo{" +
                    "id=" + id +
                    ", duration=" + duration +
                    ", distance=" + distance +
                    '}';
        }
    }

}
