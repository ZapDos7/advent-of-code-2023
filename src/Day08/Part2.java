package Day08;

import java.io.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static Day08.ParsingFunctions.*;
import static utils.ReadInputStream.readFromInputStream;

public class Part2 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            File file = new File("src/../in/day8/testInputPart2.txt");
//            File file = new File("src/../in/day8/input.txt"); //result =
            inputStream = new FileInputStream(file);
            List<String> input = readFromInputStream(inputStream);
            List<Direction> directions = parseDirections(input.get(0));
            final Tree tree = parseInstructions(input.subList(2, input.size() - 1));
            AtomicInteger stepsCounter = new AtomicInteger();
            tree.tree.keySet().stream()
                    .filter(i -> endsWith(i, 'A')).toList()
                    .parallelStream().forEach(label -> {
                while (!endsWith(label, 'Z')) {
                    System.out.println(Thread.currentThread().getName() + " not at goal yet!");
                    for (Direction direction : directions) {
                        if (endsWith(label, 'Z')) {
                            System.out.println("reached a goal!");
                            break;
                        }
                        stepsCounter.getAndIncrement();
                        if (direction.equals(Direction.LEFT)) {
                            label = tree.tree.get(label).getKey();
                        } else {
                            label = tree.tree.get(label).getValue();
                        }
                    }
                }
            });
            System.out.println("Needed " + stepsCounter + " steps to reach end goals");
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

    private static boolean endsWith(String label, Character c) {
        return label.charAt(label.length() - 1) == c;
    }
}
