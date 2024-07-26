package level2.calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> resultArray;
    public int calculate(ArrayList<Integer> resultArray,char operator, int num1, int num2) {
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("결과: " + result);
                resultArray.add(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과: " + result);
                resultArray.add(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과: " + result);
                resultArray.add(result);
                break;
            case '/':
                try {
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                    resultArray.add(result);
                } catch (ArithmeticException e) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
        }
        return result;
    }
}
