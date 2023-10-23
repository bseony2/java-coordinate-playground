package figure;

import java.util.List;

public abstract class Figure {
    private final Points points;

    public Figure(Points points) {
        this.points = points;
    }

    public List<Double> getLengths() {
        return points.getLengths();
    }

    abstract public double getArea();
}
