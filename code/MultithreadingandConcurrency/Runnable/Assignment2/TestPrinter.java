package code.MultithreadingandConcurrency.Runnable.Assignment2;

public class TestPrinter {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            Runnable printThread=new PrintByDifferentThread(i);
            Thread thread=new Thread(printThread);
            thread.start();
        }
    }
}
