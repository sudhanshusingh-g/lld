package code.MultithreadingandConcurrency.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws Exception {
        FutureTask[] randomNoTask=new FutureTask[10];
        for (int i = 0; i < 10; i++) {
            Callable cObj=new JavaCallable();
            randomNoTask[i]=new FutureTask<>(cObj);
            Thread th=new Thread(randomNoTask[i]);
            th.start();
        }

        for (int i = 0; i < 10; i++) {
            Object o=randomNoTask[i].get();
            System.out.println("The random number is :"+o);
        }
    }
}
