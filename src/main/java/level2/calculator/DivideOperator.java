package level2.calculator;

public class DivideOperator extends AbstractOperator{
    public DivideOperator(){
        super();
    }
    @Override
    public double operate(double firstNum1, double secondNum2) {
        /* 구현 */
        return firstNum1/secondNum2;
    }
}

