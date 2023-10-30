package figure.factory;

import figure.domain.Figure;
import figure.domain.Point;
import figure.enums.FigureEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory{

    private static final Map<FigureEnum, FigureCreator> adaptor = new HashMap<>();

    public FigureFactory() {
        adaptor.put(FigureEnum.LINE, new LineFactory());
        adaptor.put(FigureEnum.SQUARE, new SquareFactory());
    }

    public Figure create(List<Point> pointList) {
        FigureCreator creator = adaptor.get(FigureEnum.getFigure(pointList));

        if (creator == null) {
            throw new IllegalArgumentException("도형은 선분, 삼각형, 사각형만 생성 가능합니다. 입력값을 확인해주세요");
        }

        return creator.create(pointList);
    }
}
