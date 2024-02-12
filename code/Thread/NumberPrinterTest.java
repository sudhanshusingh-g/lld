package code.Thread;

import java.util.concurrent.*;

public class NumberPrinterTest {
    public static void main(String[] args) {
            Runnable printer=new NumberPrinter();//A a =new B();
//        Executor executor=Executors.newSingleThreadExecutor();
//        Executor executor=Executors.newFixedThreadPool(2);
        ExecutorService executor=Executors.newCachedThreadPool();

        for (int i = 1; i <50; i++) {
//            Thread newThread= new Thread(printer);
//            newThread.start();
//            executor.execute(printer);
            executor.execute(printer);
        }
        executor.shutdown();
    }
}
