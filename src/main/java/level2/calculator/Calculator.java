package level2.calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> resultArray;
    private ArrayList<Double> circleArray;
    private static final double PI = 3.14;

    public Calculator() {
        resultArray = new ArrayList<>();
        circleArray = new ArrayList<>();
    }

    /* Getter 메서드 구현 */
    public ArrayList<Integer> getResultArray () {
        return resultArray;
    }

    /* Setter 메서드 구현 */
    public void setResultArray(ArrayList<Integer> Array) {
        this.resultArray = Array;
    }

    /* 원의 넓이 저장 필드 Getter, Setter 메서드 구현 */

    public ArrayList<Double> getCircleArray() {
        return circleArray;
    }

    public void setCircleArray(ArrayList<Double> circleArray) {
        this.circleArray = circleArray;
    }


    public int calculate(char operator, int num1, int num2) {
        int result=0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                //System.out.println("결과: " + result);
                resultArray.add(result);
                break;
            case '-':
                result = num1 - num2;
                //System.out.println("결과: " + result);
                resultArray.add(result);
                break;
            case '*':
                result = num1 * num2;
                //System.out.println("결과: " + result);
                resultArray.add(result);
                break;
            case '/':
                try {
                    result = num1 / num2;
                    //System.out.println("결과: " + result);
                    resultArray.add(result);
                } catch (ArithmeticException e) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
        }
        return result;
    }
    //가장 첫번째 연산 결과를 삭제하는 함수
    public void removeResult() {
        resultArray.remove(0);
        System.out.println("삭제되었습니다.");
        System.out.println("이전 검색 결과 : "+resultArray.toString());
    }

    //저장된 연산 결과들을 조회하는 기능을 가진 메서드
    public void inquiryResults() {
        System.out.println("이전 검색 결과 : "+resultArray.toString());
    }

    /* 원의 넓이를 구하는 메서드 선언*/
    public double calculateCircleArea(double radius) {
        /* 원의 넓이 계산 구현 */
        double circleWidth =radius*radius*PI;
        circleArray.add(circleWidth);
        return circleWidth;
    }
    /* 원의 넓이 저장 필드 조회 메서드 구현 */
    public void selectCircleArray() {
        System.out.println("원의 넓이 계산 결과 기록 : "+ circleArray.toString());
    }
    /* 원의 넓이 저장 필드 첫번째 값 삭제 메서드 구현 */
    public void removeWidth() {
        circleArray.remove(0);
        System.out.println("삭제되었습니다.");
        System.out.println("원의 넓이 계산 결과 기록 : "+circleArray.toString());
    }
}
