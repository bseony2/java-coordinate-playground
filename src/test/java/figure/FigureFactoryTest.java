package figure;

import coordinate.Point;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class FigureFactoryTest {

    @Test
    void generateLine() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);

        Points points = new Points(Arrays.asList(point1, point2));

        Figure figure = FigureFactory.generateFigure(points);
        assertThat(figure instanceof Square).isFalse();
        assertThat(figure instanceof Triangle).isFalse();
        assertThat(figure instanceof Line).isTrue();
    }

    @Test
    void generateTriangel() {
        Points points = new Points(Arrays.asList(new Point(0, 0), new Point(1, 1), new Point(2, 2)));

        Figure figure = FigureFactory.generateFigure(points);

        assertThat(figure instanceof Line).isFalse();
        assertThat(figure instanceof Square).isFalse();
        assertThat(figure instanceof Triangle).isTrue();
    }

    @Test
    void generateSquare() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 1);
        Point point3 = new Point(2, 2);
        Point point4 = new Point(3, 3);

        Points points = new Points(Arrays.asList(point1, point2, point3, point4));

        Figure figure = FigureFactory.generateFigure(points);
        assertThat(figure instanceof Line).isFalse();
        assertThat(figure instanceof Triangle).isFalse();
        assertThat(figure instanceof Square).isTrue();
    }

}