package figure.domain;

import figure.enums.FigureEnum;

import java.util.List;

import static java.util.Collections.singletonList;

public abstract class Figure {

    private final List<Point> pointList;

    public Figure(List<Point> pointList) {
        this.pointList = pointList;
    }

    public double result() {

        double result = 0;
        if (FigureEnum.isLine(this)) {
            return getLineResult();
        } else if (FigureEnum.isSquare(this)) {
            return getSquareResult();
        }

        return result;
    }

    private double getLineResult() {
        return pointList.get(0).getDistanceWithOtherPoint(pointList.get(1));
    }

    private double getSquareResult() {
        double high = pointList.stream().mapToInt(Point::getY).max().getAsInt();
        double right = pointList.stream().mapToInt(Point::getX).max().getAsInt();
        double left = pointList.stream().mapToInt(Point::getX).min().getAsInt();
        double low = pointList.stream().mapToInt(Point::getY).min().getAsInt();

        double height = high - low;
        double width = right - left;

        return height * width;
    }

    public int size() {
        return this.pointList.size();
    }
}
