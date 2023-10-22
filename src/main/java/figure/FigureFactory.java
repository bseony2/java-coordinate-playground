package figure;

public class FigureFactory {

    public static Figure generateFigure(Points points) {
        if(FigureEnum.isLine(points)) {
            return generateLine(points);
        } else if (FigureEnum.isTriangle(points)) {
            return generateTriangle(points);
        }
        return generateSquare(points);
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
