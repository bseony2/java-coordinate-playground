package figure.factory;

import figure.domain.Figure;
import figure.domain.Point;
import figure.domain.Square;

import java.util.List;

public class SquareFactory implements FigureCreator {
    @Override
    public Figure create(List<Point> pointList) {
        return generateSquareWithPoints(pointList);
    }

    private Figure generateSquareWithPoints(List<Point> pointList) {
        return new Square(pointList);
    }
}
