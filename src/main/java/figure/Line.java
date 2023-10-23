package figure;

import java.util.List;

public class Line extends Figure{

    public Line(Points points) {
        super(points);
    }

    @Override
    public double getArea() {
        List<Double> lengths = getLengths();
        return lengths.get(0);
    }
}
