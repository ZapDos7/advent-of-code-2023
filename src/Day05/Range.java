package Day05;

import java.util.Arrays;
import java.util.List;

public class Range {
    int destinationStart;
    int sourceStart;
    int length;

    public Range(String line) {
        List<Integer> res = Arrays.stream(line.split("\\s")).toList().stream().map(Integer::parseInt).toList();
        if (res.size() != 3) {
            System.err.println("Error creating range");
        }
        this.destinationStart = res.get(0);
        this.sourceStart = res.get(1);
        this.length = res.get(2);
    }

    @Override
    public String toString() {
        return "Range{" +
                "destinationStart=" + destinationStart +
                ", sourceStart=" + sourceStart +
                ", length=" + length +
                '}';
    }
}
