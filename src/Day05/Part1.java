package Day05;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Part1 {

    public static void main(String[] args) {
        InputStream inputStream = null;
        Map<MapType, List<Range>> parsedInput;
        try {
            File file = new File("src/../in/day5/testInput.txt"); //new File("src/Day05/input.txt");
            inputStream = new FileInputStream(file);
            String input = readFromInputStream(inputStream);
            List<String> byNewLine = Stream.of(input.split("\n")).filter(i -> !i.isBlank()).toList();
            List<Integer> seeds = getSeeds(byNewLine);
            parsedInput = parseAlmanac(byNewLine);
            for (Map.Entry<MapType, List<Range>> entry : parsedInput.entrySet()) {
                System.out.println(entry);
            }
            //424490994
            //15290096
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.err.println("Error closing input stream");
                }
            }
        }
    }

    private static List<Integer> getSeeds(List<String> input) {
        List<String> seedsAsStrings = List.of(input.get(0).split("\\s"));
        return seedsAsStrings.stream()
                .map(String::trim)
                .map(s -> s.replaceAll("[^0-9]", ""))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .toList();
    }

    private static String readFromInputStream(InputStream inputStream) {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading from file");
        }
        return resultStringBuilder.toString();
        // TODO implement
    }

    private static Map<MapType, List<Range>> parseAlmanac(List<String> input) {
        Map<MapType, List<Range>> result = new HashMap<>();
        int lineStS = -1;
        int lineStF = -1;
        int lineFtW = -1;
        int lineWtL = -1;
        int lineLtT = -1;
        int lineTtH = -1;
        int lineHtL = -1;
        for (int i = 1; i < input.size(); i++) {
            switch (input.get(i)) {
                case "seed-to-soil map:" -> lineStS = i;
                case "soil-to-fertilizer map:" -> lineStF = i;
                case "fertilizer-to-water map:" -> lineFtW = i;
                case "water-to-light map:" -> lineWtL = i;
                case "light-to-temperature map:" -> lineLtT = i;
                case "temperature-to-humidity map:" -> lineTtH = i;
                case "humidity-to-location map:" -> lineHtL = i;
            }
        }

        //Create Seed-to-Soil Map:
        List<Range> ranges = new ArrayList<>();
        for (int i = lineStS + 1; i < lineStF; i++) {
            ranges.add(new Range(input.get(i)));
            result.put(MapType.SEED_TO_SOIL, ranges);
//            System.out.println(" seed to soil " + i + " info: " + input.get(i));
        }
        ranges = new ArrayList<>();
        //Create Soil-to-Fertilizer Map:
        for (int i = lineStF + 1; i < lineFtW; i++) {
            ranges.add(new Range(input.get(i)));
            result.put(MapType.SOIL_TO_FERTILIZER, ranges);
//            System.out.println(" soil to fertilizer " + i + " info: " + input.get(i));
        }
        ranges = new ArrayList<>();
        //Create Fertilizer-to-Water Map:
        for (int i = lineFtW + 1; i < lineWtL; i++) {
            ranges.add(new Range(input.get(i)));
            result.put(MapType.FERTILIZER_TO_WATER, ranges);
//            System.out.println(" Fertilizer-to-Water " + i + " info: " + input.get(i));
        }
        ranges = new ArrayList<>();
        //Create Water-to-Light Map:
        for (int i = lineWtL + 1; i < lineLtT; i++) {
            ranges.add(new Range(input.get(i)));
            result.put(MapType.WATER_TO_LIGHT, ranges);
//            System.out.println(" Water-to-Light " + i + " info: " + input.get(i));
        }
        ranges = new ArrayList<>();
        //Create Light-to-Temperature Map:
        for (int i = lineLtT + 1; i < lineTtH; i++) {
            ranges.add(new Range(input.get(i)));
            result.put(MapType.LIGHT_TO_TEMPERATURE, ranges);
//            System.out.println(" Light-to-Temperature " + i + " info: " + input.get(i));
        }
        ranges = new ArrayList<>();
        //Create Temperature-to-Humidity Map:
        for (int i = lineTtH + 1; i < lineHtL; i++) {
            ranges.add(new Range(input.get(i)));
            result.put(MapType.TEMPERATURE_TO_HUMIDITY, ranges);
//            System.out.println(" Temperature-to-Humidity " + i + " info: " + input.get(i));
        }
        ranges = new ArrayList<>();
        //Create Humidity-to-Location Map:
        for (int i = lineHtL + 1; i < input.size(); i++) {
            ranges.add(new Range(input.get(i)));
            result.put(MapType.HUMIDITY_TO_LOCATION, ranges);
//            System.out.println(" Humidity-to-Location " + i + " info: " + input.get(i));
        }
        //Apply Conversion Chains:
        ////        // This line means that the source range starts at 98
        //        //        // and contains two values: 98 and 99.
        //        //        // The destination range is the same length,
        //        //        // but it starts at 50, so its two values are 50 and 51.
        //        //        // With this information, you know that seed number 98
        //        //        // corresponds to soil number 50 and that seed number 99
        //        //        // corresponds to soil number 51.
        //Find the Lowest Location Number:
        return result;
    }
}
