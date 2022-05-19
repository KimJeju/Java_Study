package lambda;

public class lambdaTest {
    public static void main(String[] args) {
        LambdaTest lambdaTest;
        lambdaTest = (x) ->{
            int result = x * 5;
            System.out.println(result);
        };
        lambdaTest.accept(2);

        lambdaTest = (x) -> System.out.println(x * 5);
        lambdaTest.accept(5);
    }
}

@FunctionalInterface
interface LambdaTest{
    void accept(int x); //public 생략
}
