package calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //연산에 필요한 두 숫자 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        //사칙연산 기호 받기
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);

        //연산하고 결과 출력
        int result = 0;
        switch (operator) {
            case '+' : result = num1+num2;
                        break;
            case '-' : result = num1-num2;
                        break;
            case '*' : result = num1*num2;
                        break;
            case '/' : try {
                            result = num1/num2;
                            }catch (ArithmeticException e) {
                                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                            }
                        break;
        }
        /* exit을 입력 받으면 반복 종료 */
        System.out.println("결과: " + result);
    }
}
