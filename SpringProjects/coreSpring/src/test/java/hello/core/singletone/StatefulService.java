package hello.core.singletone;

public class StatefulService {

//    private int price; //상태를 유지하는 필드
    //객체는 하나이기 때문에 공유되어서 값이 바꿔치기된다.

//    public void order(String name,int price){
//        System.out.println("name = " + name + " price =" + price);
//        this.price = price; //여기가 문제
//        return price;
//    }

    public int order(String name,int price){
        System.out.println("name = " + name + " price =" + price);
//        this.price = price; //여기가 문제

        //값을 공유하지 않기 위해 공유되는 필드 변수를 지운다.
        return price;
    }

}
