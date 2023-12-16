package Day10;

import utils.Pair;

import java.io.*;
import java.util.*;

import static utils.ReadInputStream.readFromInputStream;

public class Part1 {
    private static final Map<Character,Pair<Direction, Direction>> pipeTypes = Map.ofEntries(
            new AbstractMap.SimpleEntry<>('|', new Pair<>(Direction.N, Direction.S)),
            new AbstractMap.SimpleEntry<>('-', new Pair<>(Direction.E, Direction.W)),
            new AbstractMap.SimpleEntry<>('L', new Pair<>(Direction.N, Direction.E)),
            new AbstractMap.SimpleEntry<>('J', new Pair<>(Direction.N, Direction.W)),
            new AbstractMap.SimpleEntry<>('7', new Pair<>(Direction.S, Direction.W)),
            new AbstractMap.SimpleEntry<>('F', new Pair<>(Direction.S, Direction.E)));

    private enum Direction {
        N, S, E, W
    }

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            File file = new File("src/../in/day10/easyInput.txt");
            inputStream = new FileInputStream(file);
            List<String> input = readFromInputStream(inputStream);
            int columnNumber = input.get(0).length();
            int rowNumbers = input.size();
            var map = generateMap(input);
            System.out.println(map);
            Pair<Integer, Integer> startingPosition;
            Map<Pair<Integer, Integer>, Character> pipes = new HashMap<>();
            Map<Pair<Integer, Integer>, Integer> pipesDistances = new HashMap<>();
            // maps coordinates to a counter of steps from start coordinates
            for (Map.Entry<Pair<Integer, Integer>, Character> entry : map.entrySet()) {
                if (entry.getValue().equals('S')) {
                    startingPosition = entry.getKey();
                } else if (isPipe(entry.getValue())) {
                    pipes.put(entry.getKey(), entry.getValue());
                    pipesDistances.put(entry.getKey(), 0);
                }
            }
            for (Map.Entry<Pair<Integer, Integer>, Character> entry : pipes.entrySet()) {
                var neighbours = getNeighboursCoords(entry.getKey(), columnNumber, rowNumbers);
                List<Pair<Integer, Integer>> possibleNextStep = new ArrayList<>();
                for (Pair<Integer, Integer> coords : neighbours) {
                    if (isPipe(map.get(coords))) {
                        possibleNextStep.add(coords);
                    }
                }
                // find routes
                // update distances
            }
            System.out.println("Result = " + pipesDistances.values().stream().max(Comparator.naturalOrder()).orElse(-1));
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

    private static boolean isValidNeighbour(Character self, Character neighbour, Direction position) {
        var selfDir = pipeTypes.get(self); // e.g. S to W
        var neighbourDir = pipeTypes.get(neighbour); // e.g. N to E
        if (position.equals(Direction.N)) {
            // neighbour is above self
            return selfDir.getLeft().equals(Direction.N) && (neighbourDir.getRight().equals(Direction.S) || neighbourDir.getLeft().equals(Direction.S));
        } else if (position.equals(Direction.S)) {
            // neighbour is below self
        } else if (position.equals(Direction.E)) {
            // neighbour is left of self
        } else if (position.equals(Direction.W)) {
            // neighbour is right of self
        }
        return false;
    }

    private static List<Pair<Integer, Integer>> getNeighboursCoords(Pair<Integer, Integer> coords, int maxX, int maxY) {
        List<Pair<Integer, Integer>> res = new ArrayList<>();
        int x = coords.getLeft();
        int y = coords.getRight();
        List<Integer> availableXs = new ArrayList<>();
        List<Integer> availableYs = new ArrayList<>();
        if (0 < x && x < maxX) {
            availableXs.add(x-1);
            availableXs.add(x+1);
        } else if (x == 0) {
            availableXs.add(x+1);
        } else if (x > maxX) {
            availableXs.add(x-1);
        }
        if (0 < y && y < maxY) {
            availableYs.add(y-1);
            availableYs.add(y+1);
        } else if (y == 0) {
            availableYs.add(y+1);
        } else if (y > maxY) {
            availableYs.add(y-1);
        }
        for (Integer i : availableXs) {
            for (Integer j : availableYs) {
                res.add(new Pair<>(i,j));
            }
        }
        return res;
    }

    private static boolean isPipe(Character character) {
        return pipeTypes.containsKey(character);
    }

    private static Map<Pair<Integer, Integer>, Character> generateMap(List<String> input) {
        Map<Pair<Integer, Integer>, Character> map = new HashMap<>();
        var columns = input.get(0).length();
        for (int y = 0; y < input.size(); y++) { //y - lines
            for (int x = 0; x < columns; x++) { // x - columns
                map.put(new Pair<>(x,y), input.get(y).charAt(x));
            }
        }
        return map;
    }
}
