package code.MultithreadingandConcurrency.Runnable.Assignment1;

public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
    }
}
