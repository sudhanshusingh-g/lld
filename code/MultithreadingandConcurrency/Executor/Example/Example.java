package code.MultithreadingandConcurrency.Executor.Example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {
    public static void main(String[] args) {
        Runnable runnableTask=new ExecutorTest();
        ExecutorService executeService= Executors.newCachedThreadPool();
        executeService.execute(runnableTask);
        executeService.shutdown();
    }
}
