package inheritance.override;

public class overridingTest {
    public static void main(String[] args) {
        MotorBike motorBike = new MotorBike(); //각각 개체에 맞는 선언
        SportsCar sportsCar = new SportsCar();

        motorBike.run();
        sportsCar.run();

        Vihecle motorBike2 = new MotorBike(); //상위 클래스에서의 선언

        motorBike2.run();



    }
}

class Vihecle{
    void run(){
        System.out.println("오토바이 출발 부릉");
    }
}

class MotorBike extends Vihecle{
    void run(){
        System.out.println("모토바이크 출발");
    }
}

class SportsCar{
    void run(){
        System.out.println("스포츠카 출발");
    }
}
