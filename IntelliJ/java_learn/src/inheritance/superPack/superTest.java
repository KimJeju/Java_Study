package inheritance.superPack;

public class superTest {
    public static void main(String[] args) {

        Lower l = new Lower();
        l.callNum();
    }
}

class Upper{
    int count = 20;
}

class Lower extends Upper{
    int count = 15 ; // this.count

    void callNum() {
        System.out.println("count =" + count);
        System.out.println("this.count =" + this.count);
        System.out.println("super.count =" + super.count);
    }
}