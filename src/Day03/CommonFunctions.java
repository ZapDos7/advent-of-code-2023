package Day03;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonFunctions {
    static List<NumberAndCoordinates> extractNumbersAndIndexes(List<String> input) {
        // given the input, it stores the numbers e.g. 467 and their first digit's coordinates e.g. 0,0
        List<NumberAndCoordinates> result = new ArrayList<>();
        int lineCount = 0;
        Pattern integerPattern = Pattern.compile("-?\\d+");
        for (String line : input) {
            Matcher matcher = integerPattern.matcher(line);
            while (matcher.find()) {
                result.add(new NumberAndCoordinates(Integer.parseInt(matcher.group()), lineCount, matcher.start()));
            }
            lineCount++;
        }
        return result;
    }

    static List<SpecialAndCoordinates> extractSymbolsAndIndexes(List<String> input) {
        // given the input, it stores the special symbol e.g. * and their first digit's coordinates e.g. 3,5
        List<SpecialAndCoordinates> result = new ArrayList<>();
        int lineCount = 0;
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        for (String line : input) {
            Matcher matcher = special.matcher(line);
            while (matcher.find()) {
                result.add(new SpecialAndCoordinates(matcher.group().charAt(0), lineCount, matcher.start()));
            }
            lineCount++;
        }
        return result;
    }

    static boolean isAdjacent(NumberAndCoordinates numAndCoords, List<SpecialAndCoordinates> symbolsAndCoords) {
        int row = numAndCoords.x; // x remains the same
        int columnStart = numAndCoords.y; // y is a span
        int columnEnd = columnStart + String.valueOf(numAndCoords.number).length();
        for (SpecialAndCoordinates symbolAndCoords : symbolsAndCoords) {
            if (symbolAndCoords.x == row && (symbolAndCoords.y == columnStart - 1 || symbolAndCoords.y == columnEnd)) { // same line
                //System.out.println("Number " + numAndCoords.number + " has adjacent to symbol " + symbolAndCoords.symbol);
                return true;
            } else if (symbolAndCoords.x == row + 1 || symbolAndCoords.x == row - 1) { // above or beyond line
                List<Integer> yValues = new ArrayList<>();
                for (int i = columnStart - 1; i < columnEnd + 1; i++) {
                    if (i >= 0) {
                        yValues.add(i);
                    }
                }
                if (yValues.contains(symbolAndCoords.y)) {
                    //System.out.println("Number " + numAndCoords.number + " has adjacent to symbol " + symbolAndCoords.symbol);
                    return true;
                }
            }
        }
        return false;
    }
}
