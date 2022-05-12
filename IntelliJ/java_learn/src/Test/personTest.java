package Test;

//상속의 개념알기

public class personTest {
    public static void main(String[] args) {
        person kunhwi = new person();
        kunhwi.hobby = "김건휘";

        progammer coding = new progammer();
        coding.name = "몰라";

        System.out.println(kunhwi.hobby);
        kunhwi.work();

        System.out.println(coding.name);
        coding.work();
    }
}

class person{

    protected String name;

    protected String hobby;

    protected String live;

    protected int age;

    void work(){
        System.out.println("일한다");
    }

    void sleep(){
        System.out.println("잔다");
    }


}

class progammer extends person{
    String whatKindOfProgrammer;

    void introduction(){
        System.out.println("프로그래밍을 합니다.");
    }


}
