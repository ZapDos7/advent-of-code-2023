package Day04;

import java.util.List;

public class CardNumbers {
    List<Integer> winningNumbers;
    List<Integer> elfNumbers;

    public CardNumbers(List<Integer> winningNumbers, List<Integer> elfNumbers) {
        this.winningNumbers = winningNumbers;
        this.elfNumbers = elfNumbers;
    }

    @Override
    public String toString() {
        return "CardNumbers{" +
                "winningNumbers=" + winningNumbers +
                ", elfNumbers=" + elfNumbers +
                '}';
    }
}
