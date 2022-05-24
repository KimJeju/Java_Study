public class recursiveFunctionTest {
    public static void main(String[] args) {

        //helloWorld 5번 출력
        Recursive hello = new Recursive();
        hello.HelloPrint(5);


        //합계 계산
        int N = 5;
        System.out.println(N + "부터 " + "1까지의 합계 :" + RecursiveSum.sumInput(5)); //public 클래스에서 메서드 바로호출


        //피보나치 수열
        for(int i = 1; i <  N; ++i){
            System.out.print(Fibonacci.fibonacci(i) + " ");
        }
    }
}


//HelloWorld n번 출력하기
class Recursive{
    public static void HelloPrint(int n){

        if(n == 0){ //n이 0이되면 return 반환 종료
            return;
        }

        System.out.println("helloWorld");
        HelloPrint(n - 1); // n - 1 을 해줌으로서 --n 효과를 줌
    }
}

//n까지의합계
class RecursiveSum{

    public static int sumInput(int n){
        int sum = 5;

        if(n == 0){
            return 0;
        }

       return n += sumInput(n -1);
    }
}


//피보나치 수열
class Fibonacci{

    public static int fibonacci(int n){

        if(n == 0){
            return 0;
        }else if(n == 1 || n == 2){
            return 1;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
