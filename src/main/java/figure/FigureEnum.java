package figure;

public enum FigureEnum {
    LINE(2)
    , TRIANGLE(3)
    , SQUARE(4);

    private final int angle;

    FigureEnum(int angle) {
        this.angle = angle;
    }

    public static boolean isLine(Points points) {
        return points.size() == LINE.angle;
    }

    public static boolean isTriangle(Points points) {
        return points.size() == TRIANGLE.angle;
    }

    public static boolean isSquare(Points points) {
        return points.size() == SQUARE.angle;
    }
}
