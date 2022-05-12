public class carTest {
    public static void main(String[] args) {
        Car bmw = new Car("red");
        Car jeep = new Car("jeep","black",130);

        System.out.println(bmw.getModel() + " " + bmw.getMaxSpeed());
        System.out.println(jeep.getModel() + " " + jeep.getColor() + " " + jeep.getMaxSpeed());


        bmw.start();
        bmw.upSpeed();
        bmw.convertible(true);
    }
}

class Car{

    private String model;
    private String color;
    private int MaxSpeed;

    Car(String model){
        this("red","blue",170);
    }
    Car(String model, String color,int maxSpeed){
        this.model = model;
        this.color = color;
        this.MaxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }


    void start() {
        System.out.println("시동 걸렸다 부릉부릉");
    }

    void upSpeed() {
        System.out.println("시동 건다 얍");
    }

    void convertible(boolean Convertible){

        if(Convertible){
            System.out.println("오픈카");
        }else {
            System.out.println("그냥 차");
        }

    }

}

