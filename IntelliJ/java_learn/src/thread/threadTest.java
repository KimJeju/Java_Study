package thread;
import java.lang.Thread;

public class threadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run(){

            }
        };



        Thread thread1 = Thread.currentThread();

        thread.setName("기모뗴");
        thread.getName();
        thread.start();
    }
}

