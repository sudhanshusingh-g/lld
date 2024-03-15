package code.MultithreadingandConcurrency.AdderSubtractorProblem.Synchronisation.method;

public class Main {
    public static void main(String[] args) throws Exception {

        Count count=new Count(0);
        Adder adder=new Adder(count);
        Subtractor subtractor=new Subtractor(count);

        Thread thread1=new Thread(adder);
        Thread thread2=new Thread(subtractor);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Output: "+count.num);
    }
}
