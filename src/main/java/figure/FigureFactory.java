package figure;

import coordinate.Point;

import java.util.List;

public class FigureFactory {

    public static Figure generateFigure(List<Point> pointList) {
        return generateFigure(new Points(pointList));
    }
    public static Figure generateFigure(Points points) {
        validate(points);
        if(FigureEnum.isLine(points)) {
            return generateLine(points);
        } else if (FigureEnum.isTriangle(points)) {
            return generateTriangle(points);
        }
        return generateSquare(points);
    }

    private static void validate(Points points) {
        if(points.size() < 1 || points.size() > 4) {
            throw new IllegalArgumentException("선분, 삼각형, 사각형만 입력이 가능합니다.");
        }
    }

    private static Figure generateLine(Points points) {
        return new Line(points);
    }

    private static Figure generateTriangle(Points points) {
        return new Triangle(points);
    }

    private static Figure generateSquare(Points points) {
        return new Square(points);
    }
}
