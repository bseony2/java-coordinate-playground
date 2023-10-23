package figure;

import coordinate.Point;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class FigureTest {

    @Test
    void getLineLength() {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(14, 15);

        Points points = new Points(Arrays.asList(point1, point2));
        Figure figure = FigureFactory.generateFigure(points);
        Line line = (Line) figure;

        assertThat(line.getArea()).isEqualTo(6.40312423, offset(0.00099));
    }

    @Test
    void getTriangleArea() {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(14, 15);
        Point point3 = new Point(20, 8);

        Points points = new Points(Arrays.asList(point1, point2, point3));
        Figure figure = FigureFactory.generateFigure(points);

        assertThat(figure.getArea()).isEqualTo(29.0, offset(0.00099));
    }

    @Test
    void getSquareArea() {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(22, 10);
        Point point3 = new Point(22, 18);
        Point point4 = new Point(10, 18);

        Points points = new Points(Arrays.asList(point1, point2, point3, point4));
        Figure figure = FigureFactory.generateFigure(points);

        assertThat(figure.getArea()).isEqualTo(96, offset(0.00099));

    }
}
