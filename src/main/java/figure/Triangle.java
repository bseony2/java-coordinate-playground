package figure;

import java.util.List;

public class Triangle extends Figure{

    public Triangle(Points points) {
        super(points);
    }

    public double getArea() {
        List<Double> lengths = getLengths();
        double s = lengths.stream().mapToDouble(Double::doubleValue).sum()/2;

        return Math.sqrt(s*(s-lengths.get(0))*(s-lengths.get(1))*(s-lengths.get(2)));
    }
}
