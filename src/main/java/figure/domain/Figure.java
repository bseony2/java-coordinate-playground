package figure.domain;

import figure.enums.FigureEnum;

import java.util.Arrays;
import java.util.List;

public abstract class Figure {

    private final List<Point> pointList;

    public Figure(List<Point> pointList) {
        this.pointList = pointList;
    }

    public int size() {
        return this.pointList.size();
    }

    public double result() {

        double result = 0;
        if (FigureEnum.isLine(this)) {
            return getLineResult();
        } else if (FigureEnum.isSquare(this)) {
            return getSquareResult();
        } else if (FigureEnum.isTriangle(this)) {
            return getTriangleResult();
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

    private double getTriangleResult() {
        double lengthA = pointList.get(0).getDistanceWithOtherPoint(pointList.get(1));
        double lengthB = pointList.get(0).getDistanceWithOtherPoint(pointList.get(2));
        double lengthC = pointList.get(1).getDistanceWithOtherPoint(pointList.get(2));

        List<Double> lengths = Arrays.asList(lengthA, lengthB, lengthC);

        double s = lengths.stream().mapToDouble(Double::doubleValue).sum()/2;

        return Math.sqrt(s*(s-lengths.get(0))*(s-lengths.get(1))*(s-lengths.get(2)));
    }
}
