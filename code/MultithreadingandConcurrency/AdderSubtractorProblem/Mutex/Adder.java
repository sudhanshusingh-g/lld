package code.MultithreadingandConcurrency.AdderSubtractorProblem.Mutex;

import java.util.Random;
import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Count count;
    Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }
    public void run(){
        for (int i = 0; i <10000 ; i++) {
            lock.lock();
            count.num++;
            lock.unlock();
        }
    }
}
