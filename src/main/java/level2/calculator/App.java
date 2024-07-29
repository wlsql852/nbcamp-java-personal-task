package level2.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */
        ArithmeticCalculator calAri = new ArithmeticCalculator();
        CircleCalculator calCir = new CircleCalculator();
        Scanner sc = new Scanner(System.in);

        boolean stop = false;
        /* 반복문 시작 */
        while(!stop) {
            System.out.println("계산 유형을 선택하세요(원의 넓이는 circle, 사칙연산은 ari 입력)");
            String celtype = sc.next();
            if (celtype.equals("circle")) {
                System.out.print("반지름 길이를 입력하세요:");
                try {
                    double radius = sc.nextDouble();
                    double width = calCir.calculate(radius);
                    System.out.println("결과 : " + width);
                }catch (InputMismatchException e) {
                    System.out.println("반지름 길이가 잘못 입력되었습니다.");
                    sc.nextLine();  //위의 nextBoolean에서의 엔터키 해소
                }

                //검색기록 조회
                calCir.inquiryResults();
                //첫번째 검색 기록 삭제
                calCir.removeResult();
            }else if(celtype.equals("ari")){
                try {
                    System.out.print("첫 번째 숫자를 입력하세요:");
                    double num1 = sc.nextDouble();
                    System.out.print("두 번째 숫자를 입력하세요:");
                    double num2 = sc.nextDouble();
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operator = sc.next().charAt(0);
                    //연산기호 set
                    calAri.setOperation(operator);
                    //계산
                    double result = calAri.calculate(num1, num2);
                    System.out.println("결과 : " + result);
                }catch (InputMismatchException e) {
                        System.out.println("숫자값이 잘못 입력되었습니다.");
                        sc.nextLine();  //위의 nextBoolean에서의 엔터키 해소
                }

                //검색기록 조회
                calAri.inquiryResults();

                //첫번째 검색 기록 삭제
                calAri.removeResult();
            }
            else {
                System.out.println("잘못된 타입입니다.");
            }
            //반복 유지할지 결정
            try {
                System.out.println("계산을 여기서 끝내시겠습니까? (true 입력 시 종료)");
                stop = sc.nextBoolean();
            }catch(InputMismatchException e) {
                System.out.println("true 또는 false를 입력하세요");
                sc.nextLine();  //위의 nextBoolean에서의 엔터키 해소
            }
        }
        /* 반복문 종료 */
        System.out.println("계산기가 종료되었습니다.");
    }
}
