package Day09;

import java.io.*;
import java.util.*;

import static utils.ReadInputStream.readFromInputStream;


public class Part1 {
    public static void main(String[] args) {

        InputStream inputStream = null;
        try {
            File file = new File("src/../in/day9/input.txt");
//            File file = new File("src/../in/day9/testInput.txt");
            inputStream = new FileInputStream(file);
            List<String> input = readFromInputStream(inputStream);
            var result = input.stream().map(Part1::predict).reduce(0, Integer::sum);
            System.out.println("Result = " + result);
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
    private static int predict(String s) {
        List<Integer> input = Arrays.stream(s.split("\\s")).map(Integer::parseInt).toList();
        List<List<Integer>> sequences = new ArrayList<>(List.of(input));
        while (!containsOnlyZeros(input)) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < input.size()-1; i++) {
                tempList.add(input.get(i+1) - input.get(i));
            }
            input = tempList;
            sequences.add(input);
        }
        int lastValue = 0;
        for (int i = sequences.size()-1; i > 0 ; i--) {
            List<Integer> line = new ArrayList<>(sequences.get(i));
            List<Integer> nextLine = new ArrayList<>(sequences.get(i - 1));
            int previousLineSize = line.size();
            if (containsOnlyZeros(line)) {
                line.add(0);
            } else {
                var previousLastValue = nextLine.get(nextLine.size()-1);
                lastValue = previousLastValue + line.get(previousLineSize - 1);
                sequences.remove(i - 1);
                nextLine.add(lastValue);
                sequences.add(i-1, nextLine);
            }
        }
        return lastValue;
    }

    private static boolean containsOnlyZeros(List<Integer> list) {
        Set<Integer> uniqueValues = new TreeSet<>(list);
        return uniqueValues.contains(0) && uniqueValues.size() == 1;
    }
}