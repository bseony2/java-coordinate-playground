package utils;

import static org.assertj.core.api.Assertions.*;

import coordinate.Point;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SeperatorTest {

    @Test
    void seperatteTest() {
        String input = "(10,10)-(14,15)";

        List<Point> result = Seperator.seperate(input);

        assertThat(new Point(10, 10)).isEqualTo(result.get(0));
        assertThat(new Point(14, 15)).isEqualTo(result.get(1));
    }
}
