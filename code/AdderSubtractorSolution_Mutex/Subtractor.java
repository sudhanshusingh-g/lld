package code.AdderSubtractorSolution_Mutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Counter count;
    private Lock lock;

    public Subtractor(Counter count,Lock lock) {
        this.count = count;
        this.lock=lock;
    }

    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            lock.lock();
            Integer value=count.getCount();
            count.setCount(value-i);
            lock.lock();
        }
    }
}
