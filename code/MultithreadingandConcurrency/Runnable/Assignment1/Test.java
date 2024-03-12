package code.MultithreadingandConcurrency.Runnable.Assignment1;

public class Test {
    public static void main(String[] args) {
        Runnable printer=new NumberPrinter();
        Thread thread=new Thread(printer);
        thread.start();
    }
}
