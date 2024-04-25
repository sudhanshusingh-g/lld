package code.MultithreadingandConcurrency.Runnable;

public class Main {
    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();

        Thread oddThread = new Thread(() -> printNumbers.printOdd(), "Odd");
        Thread evenThread = new Thread(() -> printNumbers.printEven(), "Even");

        oddThread.start();
        evenThread.start();
    }
}