package Day08;

import java.io.*;
import java.util.List;

import static Day08.ParsingFunctions.*;

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
}
