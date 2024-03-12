package code.MultithreadingandConcurrency.Runnable.Example;

public class Main {
    public static void main(String[] args) {
        Runnable thread=new NewThread();
        Thread t1=new Thread(thread);
        t1.start();
    }
}
