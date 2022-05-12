package superPack;

public class superHumen {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

class Humen{
    Humen(){
        System.out.println("휴먼 클래스 생성자");
    }
}
class Student extends Humen{
        Student(){
            super();
            System.out.println("학생 클래스 생성자");
        }

}
