package figure.factory;

import figure.domain.Figure;
import figure.domain.Line;
import figure.domain.Point;

import java.util.List;

public class LineFactory implements FigureCreator {
    @Override
    public Figure create(List<Point> pointList) {
        return generateLineWithPoints(pointList);
    }

    private Figure generateLineWithPoints(List<Point> pointList) {
        return new Line(pointList);
    }
}
