package code.Thread;

public class ExampleThread {
    public static void main(String[] args) {
        System.out.println("Current thread is : "+Thread.currentThread().getName());

        Printer p1=new Printer();
        p1.start();

        Printer p2=new Printer();
        p2.start();
    }
}
