package level2.calculator;

public class CircleCalculator extends Calculator{
    private static final double PI = 3.14;

    public CircleCalculator() {
        super();
    }
    //계산 메서드 구현
    double calculate(double radius){
        double circleWidth =radius*radius*PI;
        super.resultArray.add(circleWidth);
        return circleWidth;
    }
}
