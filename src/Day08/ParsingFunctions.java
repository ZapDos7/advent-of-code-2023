package Day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ParsingFunctions {
    static Tree parseInstructions(List<String> strings) {
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

    static List<Direction> parseDirections(String s) {
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

    static List<String> readFromInputStream(InputStream inputStream) {
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
}
