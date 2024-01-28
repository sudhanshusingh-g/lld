package code.callable;

import java.util.concurrent.*;

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableExample callObj=new CallableExample();
        ExecutorService executor= Executors.newSingleThreadExecutor();
        Future<String> returnValue=executor.submit(callObj);
        System.out.println(returnValue.get());
    }
}
