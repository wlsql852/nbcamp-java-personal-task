package level2.calculator;


public class ArithmeticCalculator extends Calculator{
    //연산기 멤버
    AbstractOperator operation = new AddOperator();
    //생성자
    public ArithmeticCalculator () {
        super();
    }

    //setter
    public void setOperation(char operator) {
        switch (operator) {
            case '+':
                this.operation = new AddOperator();
                break;
            case '-':
                this.operation = new SubtractOperator();
                break;
            case '*':
                this.operation = new MultiplyOperator();
                break;
            case '/':
                this.operation = new DivideOperator();
                break;
            case '%':
                this.operation = new ModOperator();
                break;
            default:
                System.out.println("잘못된 연산기호입니다.");
        }
    }

//    public void parserNum(double num) throws BadInputException {
//        if()
//
//    }
    //계산 메서드 구현
    double calculate(double num1, double num2){
        double result=0;
        try {
            result = operation.operate(num1,num2);
            super.resultArray.add(result);
        }catch (ArithmeticException e){
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        return result;
    }
}
