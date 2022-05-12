package inheritance;

public class inheritanceTest {
    public static void main(String[] args){

        //김건휘씨 객채셍성
        Person kimKunHwi = new Person();

        //속성과 기능 정의
        kimKunHwi.name = "김건휘";
        kimKunHwi.age = 26;

        System.out.println("이름 :" + kimKunHwi.name + " " + "나이 :"  + kimKunHwi.age );

        kimKunHwi.work();
        kimKunHwi.eat();
        kimKunHwi.sleep();

        //김코딩씨 객체생성
        Programmer kimCoding = new Programmer();

        //속성 정의
        kimCoding.name = "김코딩";
        kimCoding.age = 27;
        kimCoding.companyName = "김코딩주식회사";

        //속성 출력
        System.out.println("안녕하세요 저는 " + kimCoding.name + "입니다");
        System.out.println("나이는 " + kimCoding.age + "이구요");
        System.out.println("제 회사는 " + kimCoding.companyName + "입니다");

        //기능 정의
        kimCoding.work();
        kimCoding.programming();
        kimCoding.eat();
        kimCoding.sleep();
    }
}

class Person{

    String name;
    int age;

    void work(){
        System.out.println("일을 합니다");
    }

    void eat(){
        System.out.println("밥을 먹습니다");
    }

    void sleep(){
        System.out.println("잠을 잡니다.");
    }

}

class Programmer extends Person{
        String companyName;

        void programming(){
            System.out.println("프로그래밍을 합니다.");
        }

}

class Singer extends Person{
    String bandName;

    void Singing(){
        System.out.println("노래를 부릅니다.");
    }
}

class FireMan extends Person{
    String oneOneNine;

    void disPatch(){
        System.out.println("출동을 합니다.");
    }
}

