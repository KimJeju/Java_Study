package innerclass;

public class localInnerTest {
    public static void main(String[] args) {
        LocalOuter localOuter = new LocalOuter();
        localOuter.Test();
    }
}

class LocalOuter{

    int num = 1;

    void Test(){
        int x = 5;
        class LocalInner{
            void print(){
                System.out.println(num);
                System.out.println(x);
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.print();
        }


}

