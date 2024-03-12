package code.MultithreadingandConcurrency.Executor.Example;

public class ExecutorTest implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread created !");
    }
}
