package figure.factory;

import figure.domain.Figure;
import figure.domain.Point;
import figure.domain.Triangle;

import java.util.List;

public class TriangleFactory implements FigureCreator {

    @Override
    public Figure create(List<Point> pointList) {
        return generateTriangleWithPoints(pointList);
    }

    private Figure generateTriangleWithPoints(List<Point> pointList) {
        return new Triangle(pointList);
    }
}
