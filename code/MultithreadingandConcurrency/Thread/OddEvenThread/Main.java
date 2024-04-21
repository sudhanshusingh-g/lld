package code.MultithreadingandConcurrency.Thread.OddEvenThread;

public class Main{
    public static void main(String[] args) {
        NumberPrinter p=new NumberPrinter();

        Thread t1=new Thread(()->{
            p.printEvenNumber();
        });

        Thread t2=new Thread(()->{
            p.printEvenNumber();
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
