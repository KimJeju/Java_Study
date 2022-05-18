package innerclass;

public class anonymousClassTest {
    public static void main(String[] args) {
        GetName obg = new GetName();
        obg.getName();
    }
}

interface Name{
        String name = "김건휘";
        void getName();

}

class GetName implements Name{
    public void getName(){
        System.out.println("와타시 나마에와.." + name);
    }
}
