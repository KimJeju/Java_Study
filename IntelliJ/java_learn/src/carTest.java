public class carTest {
    public static void main(String[] args) {
        Car bmw = new Car("red");
        Car jeep = new Car("jeep","black",130);
        System.out.println(bmw);

        bmw.start();
        bmw.upSpeed();
        bmw.convertible(true);
    }
}

class Car{

    private String model;
    private String color;
    private int MaxSpeed;

    Car(){
        System.out.println("기본 생성자");
    }

    Car(String model){
        this(model,"red",150);
    }

    Car(String model, String color,int maxSpeed){
        this.model = model;
        this.color = color;
        this.MaxSpeed = maxSpeed;
    }

    void start() {
        System.out.println("시동 걸렸다 부릉부릉");
    }

    void upSpeed() {
        System.out.println("시동 건다 얍");
    }

    boolean convertible(boolean Convertible){

        if(Convertible == true){
            System.out.println("오픈카");
        }else {
            System.out.println("그냥 차");
        }

        return Convertible;
    }

}

