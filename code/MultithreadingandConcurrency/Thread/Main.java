package code.MultithreadingandConcurrency.Thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread :"+Thread.currentThread().getName());
        Thread thread=new NewThread();
        thread.start();
    }
}
