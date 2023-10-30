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
        }

        return result;
    }

    private double getLineResult() {
        return pointList.get(0).getDistanceWithOtherPoint(pointList.get(1));
    }

    public int size() {
        return this.pointList.size();
    }
}
