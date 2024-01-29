package code.AdderSubtractorProblem;

public class Subtractor implements Runnable {

    private Counter counter;

    public Subtractor(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <=1000 ; i++) {
            Integer value=counter.getValue();
            counter.setValue(value-i);
        }
    }
}
