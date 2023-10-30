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

        //given
        String input = "(10,10)-(14,15)";
        List<Point> pointList = Arrays.asList(new Point(10, 10), new Point(14, 15));

        //when
        Converter.convertInputToPoints(input);
        Figure figure = figureFactory.create(pointList);

        //then
        assertThat(FigureEnum.isLine(figure)).isTrue();
    }

    @Test
    void squareGenerate() {

        //given
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";

        //when
        List<Point> pointList = Converter.convertInputToPoints(input);
        Figure figure = figureFactory.create(pointList);

        //then
        assertThat(FigureEnum.isSquare(figure)).isTrue();
    }

    @Test
    void triangleGenerate() {

        //given
        String input = "(10,10)-(14,15)-(20,8)";

        //when
        List<Point> pointList = Converter.convertInputToPoints(input);
        Figure figure = figureFactory.create(pointList);

        //then
        assertThat(FigureEnum.isTriangle(figure)).isTrue();
    }

}