package os.code.thread;

import java.util.concurrent.*;

public class NumberPrinterTest {
    public static void main(String[] args) {
//        Executor executor=Executors.newSingleThreadExecutor();
//        Executor executor=Executors.newFixedThreadPool(2);
        Executor executor=Executors.newCachedThreadPool();
        for (int i = 1; i <=50; i++) {
            Runnable printer=new NumberPrinter(i);
//            Thread newThread= new Thread(printer);
//            newThread.start();
            executor.execute(printer);

        }
    }
}
