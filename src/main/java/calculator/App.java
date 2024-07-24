package calculator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        calculate();
        Scanner sc = new Scanner(System.in);
        /* 반복문 사용 해서 연산을 반복 */
        String stop = "continue";
        while (stop.equals("continue")) {
            System.out.println("더 계산하시겠습니까? (맞으면 continue, 종료를 원하면 exit 입력)");
            stop = sc.next();
            /* continue을 입력 받으면 반복 유지 */
            if (stop.equals("continue")) {
                calculate();
            /* exit을 입력 받으면 반복 종료 */
            } else if (stop.equals("exit")) {
                System.out.println("계산기 종료");
                break;
            } else {
                System.out.println("다시 입력해주세요");
                stop = "continue";
            }
        }
    }

    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        //연산에 필요한 첫번째 숫자 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        //사칙연산 기호 받기
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);
        //연산에 필요한 두번째 숫자 받기
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();


        //연산하고 결과 출력
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("결과: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과: " + result);
                break;
            case '/':
                try {
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
            default:
                System.out.println("처음부터 다시 입력하세요");
                calculate();
        }

    }
}
