package Day09;

import java.io.*;
import java.util.*;

import static Day09.Part1.containsOnlyZeros;
import static utils.ReadInputStream.readFromInputStream;

public class Part2 {
    public static void main(String[] args) {

        InputStream inputStream = null;
        try {
            File file = new File("src/../in/day9/input.txt");
//            File file = new File("src/../in/day9/testInput.txt");
            inputStream = new FileInputStream(file);
            List<String> input = readFromInputStream(inputStream);
            var result = input.stream().map(Part2::predict).reduce(0, Integer::sum);
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
        int firstValue = 0;
        for (int i = sequences.size()-1; i > 0 ; i--) {
            List<Integer> line = new ArrayList<>(sequences.get(i));
            List<Integer> nextLine = new ArrayList<>(sequences.get(i - 1));
//            System.out.println("Comparing " + line + " with " + nextLine);
            if (containsOnlyZeros(line)) {
                line.add(0);
            } else {
                var previousFirstValue = nextLine.get(0);
//                System.out.println("First value of line2 was " + previousFirstValue);
                firstValue = previousFirstValue - line.get(0);
//                System.out.println("First value of line2 will be " + firstValue);
                sequences.remove(i - 1);
                List<Integer> tmp = new ArrayList<>();
                tmp.add(firstValue);
                tmp.addAll(nextLine);
                nextLine = tmp;
//                System.out.println("\tNew next line = " + nextLine);
                sequences.add(i-1, nextLine);
            }
        }
//        System.out.println("\t\tcalculated " + firstValue + "\n");
        return firstValue;
    }
}