package code.MultithreadingandConcurrency.AdderSubtractorProblem.Synchronisation.block;


public class Adder implements Runnable {
    Count count;
    Object lock;

    public Adder(Count count,Object lock) {
        this.count = count;
        this.lock = lock;
    }
    public void run(){
        for (int i = 0; i <10000 ; i++) {
            synchronized (lock){
                count.num++;
            }
        }
    }
}
