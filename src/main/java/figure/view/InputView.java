package figure.view;

import figure.domain.Point;
import figure.utils.Converter;

import java.util.List;
import java.util.Scanner;

public class InputView {
    public static final Scanner sc = new Scanner(System.in);

    public static List<Point> getPointsFromUser() {
        System.out.println("좌표를 입력하세요.");
        String input = sc.nextLine();
        return Converter.convertInputToPoints(input);
    }
}
