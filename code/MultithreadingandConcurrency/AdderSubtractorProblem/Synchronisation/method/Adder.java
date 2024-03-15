package code.MultithreadingandConcurrency.AdderSubtractorProblem.Synchronisation.method;



public class Adder implements Runnable {
    Count count;

    public Adder(Count count) {
        this.count = count;
    }
    public void run(){
        for (int i = 0; i <10000 ; i++) {
            count.increment();
        }
    }
}
