package code.MultithreadingandConcurrency.Thread.OddEvenThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NumberPrinter {
    Lock lock=new ReentrantLock();
    public void printEvenNumber(){
        for (int i = 1; i <= 100; i++) {
            synchronized (lock){
                try {
                    if (i % 2 == 0) {
                        System.out.println("Even thread :" + i);
                    } else {
                        System.out.println("Odd thread :" + i);
                    }
                } finally {

                }
            }

        }
    }


}

