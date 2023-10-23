import coordinate.Point;
import figure.Figure;
import figure.FigureFactory;
import utils.Seperator;
import utils.UserInterface;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        try {
            // 사용자 입력 받기
            UserInterface.askPoints();
            String input = scanner.nextLine();

            // 사용자 입력을 좌표들로 변환
            List<Point> points = Seperator.seperate(input);

            // 좌표들을 가지고 도형 생성
            Figure figure = FigureFactory.generateFigure(points);

            // 길이나 넓이 출력
            System.out.println(figure.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            start();
        }

    }
}
