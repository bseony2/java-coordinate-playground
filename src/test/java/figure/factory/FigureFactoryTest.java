package figure.factory;

import figure.domain.Figure;
import figure.domain.Point;
import figure.enums.FigureEnum;
import figure.utils.Converter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FigureFactoryTest {

    FigureFactory figureFactory = new FigureFactory();

    @Test
    void lineGenerate() {
        List<Point> pointList = Arrays.asList(new Point(10, 10), new Point(14, 15));


        Figure figure = figureFactory.create(pointList);

        assertThat(FigureEnum.isLine(figure)).isTrue();
    }

    @Test
    void SquareGenerate() {
        //given
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        List<Point> pointList = Converter.convertInputToPoints(input);

        //when
        Figure figure = figureFactory.create(pointList);

        //then
        assertThat(FigureEnum.isSquare(figure)).isTrue();
    }

}