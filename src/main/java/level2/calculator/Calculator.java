package level2.calculator;

import java.util.ArrayList;

public abstract class Calculator {
    public ArrayList<Double> resultArray;

    public Calculator() {
        resultArray = new ArrayList<>();
    }

    /* Getter 메서드 구현 */
    public ArrayList<Double> getResultArray () {
        return resultArray;
    }

    /* Setter 메서드 구현 */
    public void setResultArray(ArrayList<Double> Array) {
        this.resultArray = Array;
    }
    //abstract double calculate(char operator, double num1, double num2);

    //abstract double calculate(double radius);
    //저장된 연산 결과들을 조회하는 기능을 가진 메서드
    public void inquiryResults() {
        System.out.println("이전 검색 결과 : "+resultArray.toString());
    }

    //가장 첫번째 연산 결과를 삭제하는 함수
    public void removeResult() {
        resultArray.remove(0);
        System.out.println("삭제되었습니다.");
        System.out.println("이전 검색 결과 : "+resultArray.toString());
    }
}
