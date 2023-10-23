package figure;

import java.util.List;

public class Square extends Figure{

    public Square(Points points) {
        super(points);
    }

    @Override
    public double getArea() {
        List<Double> lengths = getLengths();
        return lengths.get(0) * lengths.get(1);
    }

    @Override
    public String figureName() {
        return "사각형 넓이는 ";
    }
}
