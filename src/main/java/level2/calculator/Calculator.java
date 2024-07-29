package level2.calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Calculator {
    public ArrayList<Double> resultArray;
    Scanner sc = new Scanner(System.in);

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
    //저장된 연산 결과들을 조회하는 기능을 가진 메서드
    public void inquiryResults() {
        try {
            System.out.println("결과기록을 보시겠습니까? (true/false 입력)");
            boolean resultLog = sc.nextBoolean();
            if (resultLog) System.out.println("이전 검색 결과 : " + resultArray.toString());
        }catch (InputMismatchException e) {
            System.out.println("true 또는 false를 입력하세요");
            sc.nextLine();  //위의 nextBoolean에서의 엔터키 해소
        }
    }

    //가장 첫번째 연산 결과를 삭제하는 함수
    public void removeResult() {
        try {
            System.out.println("첫번째 결과기록을 삭제하시겠습니까? (true/false 입력");
            boolean remove = sc.nextBoolean();
            if (remove) {
                resultArray.remove(0);
                System.out.println("삭제되었습니다.");
                System.out.println("이전 검색 결과 : " + resultArray.toString());
            }
        }catch (InputMismatchException e) {
            System.out.println("true 또는 false를 입력하세요");
            sc.nextLine();  //위의 nextBoolean에서의 엔터키 해소
        }
    }
}
