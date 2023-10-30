package figure.factory;

import figure.domain.Figure;
import figure.domain.Point;

import java.util.List;

public interface FigureCreator {
    Figure create(List<Point> pointList);
}
