package lambda;


public class lambdaa {
    public static void main(String[] args) {
        Test test; //람다식 선언

        test = (x,y) -> {
            int result = x * y;
            return result;
        };
        int result1 = test.accept(1,5);
        System.out.println(result1);


        test = (x,y) -> {return x + y;};
        int result2 = test.accept(3,3);
        System.out.println(result2);

        test = (x,y) -> x / y; // return 만 있을경우 {} 와 return 생략가능
        int result3 = test.accept(4,10);
        System.out.println(result3);

        test = (x,y) -> sum(1,2);
        int result4 = test.accept(5,29);
        System.out.println(result4);

    }

    public static int sum(int x,int y){
        return x % y;
    }
}



@FunctionalInterface //함수 인테페이스 내에 추상메서드가 2개라면 컴파일오류반환
interface Test{
    public int accept(int x, int y); //리턴 타입이 있는 추상메서드
}




