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
    }

    public Figure create(List<Point> pointList) {
        FigureCreator creator = adaptor.get(FigureEnum.getFigure(pointList));
        return creator.create(pointList);
    }
}
