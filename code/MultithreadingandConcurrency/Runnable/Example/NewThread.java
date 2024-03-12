package code.MultithreadingandConcurrency.Runnable.Example;

public class NewThread implements Runnable {
    @Override
    public void run() {
        System.out.println("thread : "+Thread.currentThread().getName());
    }
}
