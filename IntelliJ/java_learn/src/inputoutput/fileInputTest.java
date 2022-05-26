package inputoutput;
import java.io.*;
import java.lang.Thread;

public class fileInputTest {
    public static void main(String[] args)
    {
//        Runnable Task = new Task();
//        Thread thread = new Thread(Task);
//
//        thread.start();

        System.out.println(test(4));



    }

        static int test(int n){
            if(n == 0 ){
                return 0;
            }else if(n == 1 || n == 2){
                return 1;
            }else{
               return (n - 1) + (n - 2);
            }
    }
}

class Task implements Runnable{
    public void run(){};
}




