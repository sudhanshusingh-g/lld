package code.MultithreadingandConcurrency.Runnable.Assignment2;

public class PrintByDifferentThread  implements Runnable{
    private int number;
    public PrintByDifferentThread(int number){
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println("Number : "+number+" printed by "+Thread.currentThread().getName());
    }
}
