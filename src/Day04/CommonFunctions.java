package Day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonFunctions {
    static Map<Integer, CardNumbers> parse(List<String> input) {
        Map<Integer, CardNumbers> result = new HashMap<>();
        for (String line : input) {
            // Format: Card X: winning numbers | your numbers
            String[] byColon = line.split(":");
            int key = Integer.parseInt(byColon[0].replaceAll("[^0-9]", ""));
            String[] byVerticalBar = byColon[1].split("\\|");
            List<Integer> winningNumbers = new ArrayList<>();
            List.of(byVerticalBar[0].trim().split("\\s+")).forEach(s -> winningNumbers.add(Integer.parseInt(s)));
            List<Integer> elfNumbers = new ArrayList<>();
            List.of(byVerticalBar[1].trim().split("\\s+")).forEach(s -> elfNumbers.add(Integer.parseInt(s)));
            CardNumbers value = new CardNumbers(winningNumbers, elfNumbers);
            //
            result.put(key, value);
        }
        return result;
    }

    static int cardValue(CardNumbers cn) {
        var result = cn.winningNumbers;
        result.retainAll(cn.elfNumbers);
        return result.size();
    }
}
