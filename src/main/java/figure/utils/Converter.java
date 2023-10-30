package figure.utils;

import figure.domain.Point;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static List<Point> convertInputToPoints(String input) {
        List<Point> pointList = new ArrayList<>();
        for (String point : input.split("-")) {
            pointList.add(generatePoint(point));
        }
        return pointList;
    }

    public static Point generatePoint(String input) {
        String[] splitedInput = input.split(",");
        int x = Integer.parseInt(splitedInput[0].replace("(", ""));
        int y = Integer.parseInt(splitedInput[1].replace(")", ""));

        return new Point(x, y);
    }
}
