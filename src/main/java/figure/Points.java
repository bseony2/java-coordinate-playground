package figure;

import coordinate.Point;

import java.util.*;

public class Points implements Iterable<Point>{

    private final List<Point> pointList;

    public Points(List<Point> pointList) {
        this.pointList = pointList;
    }

    @Override
    public Iterator<Point> iterator() {
        return pointList.iterator();
    }

    public int size() {
        return pointList.size();
    }

    public List<Double> getLengths() {
        List<Double> result = new ArrayList<>();

        if (FigureEnum.isLine(this)) {
            result.addAll(getLineLenth());
        }
        else if (FigureEnum.isTriangle(this)) {
            result.addAll(getTriangleLength());
        } else if (FigureEnum.isSquare(this)) {
            result.addAll(getSquareLineLengths());
        }

        return result;
    }

    private List<Double> getLineLenth() {
        return Collections.singletonList(pointList.get(0).getDistanceWithOtherPoint(pointList.get(1)));
    }

    private List<Double> getTriangleLength() {
        double lengthA = pointList.get(0).getDistanceWithOtherPoint(pointList.get(1));
        double lengthB = pointList.get(0).getDistanceWithOtherPoint(pointList.get(2));
        double lengthC = pointList.get(1).getDistanceWithOtherPoint(pointList.get(2));

        return Arrays.asList(lengthA, lengthB, lengthC);
    }

    private Collection<Double> getSquareLineLengths() {
        int high = pointList.stream().mapToInt(Point::getY).max().getAsInt();
        int right = pointList.stream().mapToInt(Point::getX).max().getAsInt();
        int left = pointList.stream().mapToInt(Point::getX).min().getAsInt();
        int low = pointList.stream().mapToInt(Point::getY).min().getAsInt();

        double height = high - low;
        double width = right - left;

        return Arrays.asList(height, width);
    }
}
