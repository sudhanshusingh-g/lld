package code.MultithreadingandConcurrency.AdderSubtractorProblem.Synchronisation.method;

public class Subtractor implements Runnable {
    Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    public void run(){
        for (int i = 0; i < 10000; i++) {
            count.decrement();
        }
    }
}
