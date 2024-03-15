package code.MultithreadingandConcurrency.AdderSubtractorProblem.Synchronisation.block;

public class Main {
    public static void main(String[] args) throws Exception {
        Object lock=new Object();
        Count count=new Count(0);
        Adder adder=new Adder(count,lock);
        Subtractor subtractor=new Subtractor(count,lock);

        Thread thread1=new Thread(adder);
        Thread thread2=new Thread(subtractor);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Output: "+count.num);
    }
}
