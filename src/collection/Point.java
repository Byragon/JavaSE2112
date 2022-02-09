package collection;

import java.util.Objects;

/**
 *
 */
public class Point {
    private int x;
    private int y;

    public Point(int i, int i1) {
        this.x=i;
        this.y=i1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
