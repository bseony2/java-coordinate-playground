package figure.domain;

import java.util.List;

public class Figure {

    private final Points points;

    public Figure(List<Point> pointList) {
        this.points = new Points(pointList);
    }

    public int size() {
        return this.points.size();
    }
}
