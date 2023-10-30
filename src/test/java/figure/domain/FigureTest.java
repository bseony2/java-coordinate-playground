package figure.domain;

import figure.factory.FigureFactory;
import figure.utils.Converter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class FigureTest {

    FigureFactory figureFactory = new FigureFactory();

    @Test
    void lineResult() {

        //given
        String input = "(10,10)-(14,15)";

        //when
        List<Point> pointList = Converter.convertInputToPoints(input);
        Figure figure = figureFactory.create(pointList);

        //then
        assertThat(figure.result()).isEqualTo(6.40312423, offset(0.00099));
    }


}