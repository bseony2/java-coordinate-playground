package utils;

import coordinate.Point;

import java.util.ArrayList;
import java.util.List;

public class Seperator {

    public static List<Point> seperate(String input) {
        List<Point> points = new ArrayList<>();
        String[] pointArr = input.split("-");
        for (String s : pointArr) {
            points.add(convertToPoint(s));
        }
        return points;
    }

    private static Point convertToPoint(String stringPoint) {
        String[] result = stringPoint.substring(1, stringPoint.length()-1).split(",");
        int x = Integer.parseInt(result[0]);
        int y = Integer.parseInt(result[1]);
        return new Point(x, y);
    }
}
