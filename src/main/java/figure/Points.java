package figure;

import coordinate.Point;

import java.util.Iterator;
import java.util.List;

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
}
