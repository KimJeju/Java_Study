package generic;


public class genericTest {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        String str1 = testClass.<String>accept("Kim Coding");
        String str2 = testClass.accept("김코딩");  //입력 매개변수 값으로 타입이 유추가 가능하면 제네릭 타입 지정 생략가능

        System.out.println(str1);
        System.out.println(str2);

        testClass.getPrint("김코딩",1);
        testClass.<String, Integer>getPrint("김코딩",2);
    }
}


class TestClass{ //일반클래스 내부에 제네릭 메서드 선언
    public <T> T accept(T t){
        return t;
    }

    public <V,K> void getPrint(V v, K k){ //리턴 타입앞에 타입 매개변수 언언
        System.out.println(v + ":" + k);
    }
}