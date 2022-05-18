package innerclass;

public class staticInnerTest {
    public static void main(String[] args) {
        Outer.StaticInClass staticInClass = new Outer.StaticInClass(); //정적 이너클래스의 객체생성
        staticInClass.print();
    }
}

class Outer{ //외부클래스
    private int num1 = 10;
    private static int num2 = 15;

    void getPrint(){ //메서드 정적 클래스에서 사용불가
        System.out.println("인스턴스 변수");
    }

    static void getPrintStatic(){ //정적 메서드
        System.out.println("정적 인스턴스 변수");
    }

    static class StaticInClass{ //정적 클래스
       static void print(){
           System.out.println("정적 인스턴스 변수 :" + num2 +" "+ "외부정적변수");
           getPrintStatic();
           //getPrint 와  num1은 정적 변수 및 정적 메서드가 아니기 떄문에 사용불가
        }
    }


}
