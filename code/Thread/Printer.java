package code.Thread;

public class Printer extends Thread {
    @Override
    public void run() {
        System.out.println("Printer thread is printed by: "+Thread.currentThread().getName());
    }
}
