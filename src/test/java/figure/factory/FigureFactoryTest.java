package figure.factory;

import figure.domain.Figure;
import figure.domain.Point;
import figure.enums.FigureEnum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FigureFactoryTest {

    @Test
    void LineGenerate() {
        List<Point> pointList = Arrays.asList(new Point(10, 10), new Point(14, 15));
        FigureFactory figureFactory = new FigureFactory();

        Figure figure = figureFactory.create(pointList);

        assertThat(FigureEnum.isLine(figure)).isTrue();
    }

}