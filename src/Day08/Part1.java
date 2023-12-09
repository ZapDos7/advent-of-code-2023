package Day08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Part1 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
//            File file = new File("src/../in/day8/testInput.txt");
//            File file = new File("src/../in/day8/testInput2.txt");
            File file = new File("src/../in/day8/input.txt"); //result = 19783
            inputStream = new FileInputStream(file);
            List<String> input = readFromInputStream(inputStream);
            List<Direction> directions = parseDirections(input.get(0));
            Tree tree = parseInstructions(input.subList(2, input.size() - 1));
            System.out.println("Directions " + directions);
            System.out.println(tree);
            String label = "AAA";
            int stepsCounter = 0;
            while (!label.equals("ZZZ")) {
                System.out.println("not at goal yet!");
                for (Direction direction : directions) {
                    if (label.equals("ZZZ")) {
                        System.out.println("reached the goal!");
                        break;
                    }
                    stepsCounter++;
                    if (direction.equals(Direction.LEFT)) {
                        label = tree.tree.get(label).getKey();
                    } else {
                        label = tree.tree.get(label).getValue();
                    }
                }
            }
            System.out.println("Needed " + stepsCounter + " steps to reach ZZZ");
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

    private static Tree parseInstructions(List<String> strings) {
        Tree tree = new Tree();
        for (String s : strings) {
            String[] byEquals = s.split("=");
            String start = byEquals[0].trim();
            String[] byComma = byEquals[1].split(",");
            String left = byComma[0].trim().substring(1);
            String right = byComma[1].trim().substring(0, byComma[1].trim().length() - 1);
            tree.addElement(start, left, right);
        }
        return tree;
    }

    private static List<Direction> parseDirections(String s) {
        List<Direction> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                result.add(Direction.LEFT);
            } else if (s.charAt(i) == 'R') {
                result.add(Direction.RIGHT);
            } else {
                System.err.println("Direction line contains odd character [index" + i + "]");
            }
        }
        return result;
    }

    private static List<String> readFromInputStream(InputStream inputStream) {
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
        return List.of(resultStringBuilder.toString().split("\n"));
    }

    enum Direction {
        LEFT, RIGHT
    }
}
