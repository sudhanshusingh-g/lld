package code.MultithreadingandConcurrency.AdderSubtractorProblem.Synchronisation.block;

public class Subtractor implements Runnable {
    Count count;
    Object lock;
    public Subtractor(Count count,Object lock) {
        this.count = count;
        this.lock=lock;
    }

    public void run(){
        for (int i = 0; i < 10000; i++) {
            synchronized (lock) {
                count.num--;
            }
        }
    }
}
