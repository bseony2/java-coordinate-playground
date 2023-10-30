package figure.domain;

import java.util.List;

public class Points {
    private final List<Point> points;

    public Points(List<Point> points) {
        this.points = points;
    }

    public int size() {
        return this.points.size();
    }
}
