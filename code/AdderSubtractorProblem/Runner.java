package code.AdderSubtractorProblem;


import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Counter count=new Counter(0);

        Adder adder=new Adder(count);
        Subtractor subtractor=new Subtractor(count);

        Executor executor= Executors.newCachedThreadPool();

        executor.execute(adder);
        executor.execute(subtractor);
        ((ExecutorService) executor).awaitTermination(1,TimeUnit.SECONDS);
        System.out.println("result :"+count.getValue());
    }
}
