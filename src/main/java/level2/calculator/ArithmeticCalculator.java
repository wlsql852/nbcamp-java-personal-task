package level2.calculator;

public class ArithmeticCalculator extends Calculator{

    public ArithmeticCalculator () {
        super();
    }
    //계산 메서드 구현
    double calculate(char operator, double num1, double num2){
        double result=0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                //System.out.println("결과: " + result);
                super.resultArray.add(result);
                break;
            case '-':
                result = num1 - num2;
                //System.out.println("결과: " + result);
                super.resultArray.add(result);
                break;
            case '*':
                result = num1 * num2;
                //System.out.println("결과: " + result);
                super.resultArray.add(result);
                break;
            case '/':
                try {
                    result = num1 / num2;
                    //System.out.println("결과: " + result);
                    super.resultArray.add(result);
                } catch (ArithmeticException e) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
        }
        return result;
    }
}
