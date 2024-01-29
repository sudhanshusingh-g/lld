package code.AdderSubtractorSolution_Mutex;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Counter count=new Counter(0);
        Lock lock=new ReentrantLock();

        Adder adder=new Adder(count,lock);
        Subtractor subtractor=new Subtractor(count,lock);

        Executor executor= Executors.newCachedThreadPool();
        executor.execute(adder);
        executor.execute(subtractor);


        System.out.println("Result : "+count.getCount());
    }
}
