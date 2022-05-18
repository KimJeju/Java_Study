package innerclass;

public class anonymousClassTest2 {
    public static void main(String[] args) {
        Name2 obj = new Name2(){
            public void getName(){
                System.out.println("내 이름은" + name);
            }
        };
        obj.getName();
    }
}

interface Name2{
    String name = "김건휘";
    void getName();
}
