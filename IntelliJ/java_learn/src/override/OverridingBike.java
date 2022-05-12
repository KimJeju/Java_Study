package override;

public class OverridingBike {
    void run() {
        System.out.println("바이크 출발 부릉");
    }
}

    class Bike extends OverridingBike{
        void run(){
            System.out.println("바이크가 출발 부르릉");
        }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }

}
