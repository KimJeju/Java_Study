package abstractstudy;

public class abstractCarTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar();
        sportsCar.sound();

        Car jeep = new OffroadCar();
        jeep.sound();

    }
}

abstract class Car{ // 메서드 시그니처만 있는 추상클래스
        String kind;
        abstract void sound(); //바디가 없는 추상메서드
    }

    class SportsCar extends Car{ //Car 클래스로부터 상속

        SportsCar(){ // 생성자 작성
            this.kind = "스포츠카";
        }

        void sound(){
            System.out.println("스포츠카 부릉부릉"); //메서드 오버라이딩 ->구현부 작성
        }

        //public String toString(){return "포르쉐";}

    }

    class OffroadCar extends Car{

        OffroadCar(){
            this.kind = "오프로드";
        }

        void sound(){
            System.out.println("오프로드 부앙부앙");
        }

        //public String toString(){return "지프";}
    }




