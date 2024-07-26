package level2.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */
        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
        String stop = "continue";
        while(!stop.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            //계산
            int result = cal.calculate(operator, num1, num2);
            System.out.println("결과 : " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            stop = sc.next();  //exit이 아니면 어떤 값이든 반복재생
        }
        /* 반복문 종료 */
        System.out.println("계산기가 종료되었습니다.");
    }
}
