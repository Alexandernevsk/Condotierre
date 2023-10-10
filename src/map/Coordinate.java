package map;


import java.util.ArrayList;
import java.util.Objects;

public class Coordinate {
    private int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean adjacent(Coordinate coordinate, boolean diagonal) {
        int absRow = Math.abs(this.x - coordinate.x);
        int absColumn = Math.abs(this.y - coordinate.y);
        boolean checkRow = (absRow == 1 || absRow == 0);
        boolean checkColumn = (absColumn == 1 || absColumn == 0);

        if (diagonal) {
            return (checkRow && checkColumn);
        }

        return (checkRow && absColumn == 0) || (checkColumn && absRow == 0);
    }

    @Override
    public String toString() {
        return String.format("x : %d  y : %d", x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
