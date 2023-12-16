package utils;

import java.util.Objects;

public class Pair<T,Y> {
    T left;
    Y right;

    public Pair(T left, Y right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public Y getRight() {
        return right;
    }

    public void setRight(Y right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
