package code.MultithreadingandConcurrency.Thread;

public class NewThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread :"+Thread.currentThread().getName());
    }
}
