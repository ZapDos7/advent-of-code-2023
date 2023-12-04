package Day03;

public class NumberAndCoordinates {
    int number;
    int x;
    int y;

    public NumberAndCoordinates(int number, int x, int y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "NumberAndCoordinates{" +
                "number=" + number +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
