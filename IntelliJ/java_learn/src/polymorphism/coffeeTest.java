package polymorphism;

public class coffeeTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.BuyCoffee(new Americano());
        customer.BuyCoffee(new Cafemocha());

        System.out.println("현재 잔액은" + customer.money + "원입니다.");

    }
}

class Coffee{
    int price;

    public Coffee(int price){
        this.price = price;
    }
}


class Americano extends Coffee{
    public Americano(){ //전역에서 쓸 수 있게 생성자에 public 선언
        super(4000); //super 클래스를 이용한 상위클래스 Coffee 의 생성자 호출
    }

    public String toString() {return "아메리카노";}; //Object 의 클래스 toString() 메서드 오버라이딩 -< 재정의
                                                    //toString()은 객체의 정보나 값들을 문자열로 리턴해주는 오비젝트 클래스이다.
};

class Cafemocha extends Coffee{
   public Cafemocha(){
       super(5000);
   }

   public String toString() {return "카페모카";};
};

class Customer{
    public int money = 50000;

    void BuyCoffee(Coffee coffee){
        if(money < coffee.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }else{
            System.out.println(coffee + "를 구입하였습니다.");
        }
        money -= coffee.price; // money = money - coffee.price 와 같음
        System.out.println(coffee.price +"원입니다");
    }


}
