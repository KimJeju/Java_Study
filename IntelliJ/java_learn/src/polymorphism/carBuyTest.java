package polymorphism;

public class carBuyTest {
    public static void main(String[] args) {
        Buy buy = new Buy();
        buy.BuyCar(new Porsche());
        buy.BuyCar(new Jeep());
    }
}

class Car{

    int price;

    Car(int price){
      this.price = price;
    }
}

class Porsche extends Car{
    public Porsche(){
        super(5);
    }

    public String toString(){return "포르쉐";};
}

class Jeep extends Car{
    public Jeep(){
        super(3);
    }

    public String toString(){return "지프";};
}

class Buy{
    int money = 10;

    void BuyCar(Car car){
        if(money < car.price){
            System.out.println("돈이 부족합니다.");
            return;

        }else{
            System.out.println(car + "를 구매하였습니다.");
        }
        money = money - car.price;
        System.out.println(money + "억 남았습니다.");
    }
}
