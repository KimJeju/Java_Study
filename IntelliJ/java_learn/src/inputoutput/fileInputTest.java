package inputoutput;
import java.io.*;
import java.lang.Thread;

public class fileInputTest {
    public static void main(String[] args)
    {
        Runnable Task = new Task();
        Thread thread = new Thread(Task);

        thread.start();


    }
}

class Task implements Runnable{
    public void run(){};
}
