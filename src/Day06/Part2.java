package Day06;

import java.util.AbstractMap;
import java.util.List;

public class Part2 {
    public static void main(String[] args) {
//        List<String> input = List.of("Time:      7  15   30", "Distance:  9  40  200");
//        e.g. 4*8*9 = 288
        List<String> input = List.of("Time:        40     82     91     66", "Distance:   277   1338   1349   1063");

        AbstractMap.SimpleEntry<Long, Long> raceInfo = parse(input); // duration, distance
        if (raceInfo == null) {
            System.err.println("Invalid input");
            return;
        }
        var result = waysToBeatRace(raceInfo);
        System.out.println("Result = " + result);
    }

    private static int waysToBeatRace(AbstractMap.SimpleEntry<Long, Long> raceInfo) {
        int result = 0;
        long inputDuration = raceInfo.getKey();
        long inputDistance = raceInfo.getValue();
        for (int i = 0; i < inputDuration; i++) {
            long leftoverTime = inputDuration - i; // hold for i seconds
            long distance = i * leftoverTime;
//            System.out.println("Hold for " + i + " seconds. Leftover time = " + leftoverTime + ". Traveled for " + distance + " mm. Should travel " + inputDistance + " mm.");
            if (distance >= inputDistance) {
                result++;
            }
        }
        return result;
    }

    private static AbstractMap.SimpleEntry<Long, Long> parse(List<String> input) {
        if (input.size() != 2) {
            System.err.println("Invalid input");
            return null;
        }
        long time = Integer.parseInt(input.get(0).split(":")[1].replaceAll("[^0-9]", ""));
        long distance = Long.parseLong(input.get(1).split(":")[1].replaceAll("[^0-9]", ""));
        return new AbstractMap.SimpleEntry<> (time, distance);
    }
}
