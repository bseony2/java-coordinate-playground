package figure;

import figure.domain.Figure;
import figure.domain.Point;
import figure.factory.FigureFactory;
import figure.view.InputView;
import figure.view.ResultView;

import java.util.List;

public class Game {

    private final FigureFactory figureFactory = new FigureFactory();

    public void start() {
        try {
            // 사용자 입력 받기
            List<Point> pointList = InputView.getPointsFromUser();

            // 좌표들을 가지고 도형 생성
            Figure figure = figureFactory.create(pointList);

            // 길이나 넓이 출력
            ResultView.printView(figure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            start();
        }

    }
}
