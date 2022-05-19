package lambda;

import java.util.function.IntBinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = CalculatorTest::staticMethod;
        System.out.println(operator.applyAsInt(2,6));

        CalculatorTest calculator = new CalculatorTest();
        operator = calculator::instanceMethod;
        System.out.println(operator.applyAsInt(4,5));
    }
}

class CalculatorTest{
    public static int staticMethod(int x ,int y){
        int sum = x + y;
        return sum;
    }

    public int instanceMethod(int x, int y){
        int multiply = x * y;
        return multiply;
    }
}
