package Test;

public class animalTest {
    public static void main(String[] args) {

        herbivores rabbit = new herbivores();
        rabbit.name = "토끼";
        rabbit.type = "초식동물";
        rabbit.foots = 4;
        System.out.println(rabbit.name + "이구요" + " " + rabbit.type + "이에여" + " " + "발은" + rabbit.foots + "개에요");




    }
}

class animal{
    protected String name;
    protected String kinds;
    protected int foots;
    protected String type;

    void String(){
        System.out.println("먹이를 먹습니다");
    }





}

class herbivores extends animal {

    String food;
}

class predator extends animal {

    String food;
}

