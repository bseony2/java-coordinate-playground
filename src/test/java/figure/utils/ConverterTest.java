package figure.utils;


import figure.domain.Point;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ConverterTest {

    @Test
    void pointConvertTest() {
        String input = "(10,10)";
        Point point = new Point(10, 10);
        Point convertedPoint = Converter.generatePoint(input);
        assertThat(point).isEqualTo(convertedPoint);
    }

    @Test
    void convertUserInputToPoints() {
        String input = "(10,10)-(14,15)";

        List<Point> pointList = Converter.convertInputToPoints(input);
        assertThat(pointList).containsExactly(new Point(10, 10), new Point(14, 15));
    }
}