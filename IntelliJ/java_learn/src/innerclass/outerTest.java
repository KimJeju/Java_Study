package innerclass;

public class outerTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println("외부클래스를 사용하여 내부클래스 호출 가능");
        outerClass.testClass();
    }
}

class OuterClass{
    private int num = 1; //외부 클래스 private 변수
    private int num2 = 2; //외부 클래스 정적 변수

    private InClass inClass; //내부 클래스의 자료형 변수 선언.

    public OuterClass(){
        inClass = new InClass(); //외부 클래스 생성자
    }

    class InClass { //인스턴스 내부클래스
        int inNum = 10; //내부클래스의 인스턴스 변수

        void Test() {
            System.out.println("Outer Num :" + num + "외부 클래스의 인스턴스 변수");
            System.out.println("Outer Num2 :" + num2 + "외부 클래스 정적 인스턴스 변수");
        }
    }

    public void testClass(){
        inClass.Test();
    }
}
