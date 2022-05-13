package polymorphism;

public class typecastringTest {
    Another another = new Another();
    Vehicle vehicle = (Vehicle) another; //상위 클래스 Vehicle 타입으로 변환(생략가능)
    // Vehicle vehicle = another; 상위클래스 타입변환에서의 () 생략
    Another another1 = (Another) vehicle; //하위클래스에서의 상위클래스 타입변환(업캐스팅 괄호 생략불가)

    // Feat feat = (Feat) another; // -> 상속관계가 아니므로 타입변환 불가 -> 에러발생

}

class Vehicle{
    String model;
    String color;
    int wheels;

    void StartEngine(){
        System.out.println("시동걸기");
    }

    void accelerator(){
        System.out.println("속도 올리기");
    }

    void brake(){
        System.out.println("감속");
    }
}

class Another extends Vehicle{
    void anotherPerson(){
        System.out.println("다른 사람 태우기");
    }
}

class Feat extends Vehicle{
    void feat(){
        System.out.println("묘기 부리기");
    }
}
