package figure.view;

import figure.domain.Figure;
import figure.enums.FigureEnum;

public class ResultView {

    public static void printView(Figure figure) {
        StringBuilder sb = new StringBuilder();
        if (FigureEnum.isLine(figure)) {
            sb.append("두 점 사이 거리는 ");
        } else if (FigureEnum.isSquare(figure)) {
            sb.append("사각형 넓이는 ");
        } else if (FigureEnum.isTriangle(figure)) {
            sb.append("삼각형 넓이는 ");
        }

        sb.append(figure.result());
        System.out.println(sb.toString());
    }
}
