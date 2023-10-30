package figure.enums;

import figure.domain.Figure;
import figure.domain.Point;

import java.util.Arrays;
import java.util.List;

public enum FigureEnum {

    LINE(2)
    , Square(4)
    , Triangle(3);
    private final int numOfPoint;

    FigureEnum(int numOfPoint) {
        this.numOfPoint = numOfPoint;
    }

    public static boolean isLine(Figure figure) {
        return figure.size() == LINE.numOfPoint;
    }

    public static FigureEnum getFigure(List<Point> pointList) {
        return Arrays.stream(FigureEnum.values())
                .filter(figure -> figure.numOfPoint == pointList.size())
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("도형은 선분, 삼각형, 사각형만 생성 가능합니다. 입력값을 확인해주세요"));
    }
}
