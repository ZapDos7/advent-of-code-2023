package Day03;

public class SpecialAndCoordinates {
    char symbol;
    int x;
    int y;

    public SpecialAndCoordinates(char symbol, int x, int y) {
        this.symbol = symbol;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "SpecialAndCoordinates{" +
                "symbol=" + symbol +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
