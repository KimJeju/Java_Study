package polymorphism;


public class instanceofTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof Object); //Object 클래스는 최상위 클래스이기 때문에 true
        System.out.println(animal instanceof Tiger); // animal은 Animal을 참조변수로 가지고 있기 때문에 true;
        System.out.println(animal instanceof lion ); // lion은 animal을 참조변수로 가지고 있지 않기 때문에 false;

        Animal tiger = new Tiger();
        System.out.println(tiger instanceof Object); //true
        System.out.println(tiger instanceof Animal); //true
        System.out.println(tiger instanceof Tiger); //true
        System.out.println(tiger instanceof lion);// false;

    }
}

class Animal{};
class Tiger extends Animal{};
class lion extends  Animal{};

