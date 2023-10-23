package coordinate;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj==null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return this.x == point.x && this.y == point.y;
    }

    @Override
    public String toString() {
        return "x좌표 : " + x + ", y좌표 : " + y;
    }

    public double getDistanceWithOtherPoint(Point a) {
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
    }
}
