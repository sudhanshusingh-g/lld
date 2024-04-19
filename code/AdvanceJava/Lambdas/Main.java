package code.AdvanceJava.Lambdas;

public class Main {
    public static void main(String[] args) {

        A a=new A(){
            //Anonymous class
            @Override
            public void show() {
                System.out.println("Anonymous A");
            }
        };
        a.show();

        B b=()-> System.out.println("Lambda B");
        b.bb();

        C c=n -> {
            int square=n * n;
            System.out.println(square);
        };
        c.square(5);

        D d=(p,q)->{
            int sum=p+q;
            System.out.println(sum);
        };
        d.sum(12,24);


        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("I am in thread: "+Thread.currentThread().getName());
            }
        };
        Thread t=new Thread(r);
        t.start();


        Runnable rL=()-> {
                System.out.println("I am in thread: "+Thread.currentThread().getName());
            };

        Thread t1=new Thread(rL);
        t1.start();
    }



}
 class A{
    public void show(){
        System.out.println("A");
    }
}

interface B{
    public void bb();
}

interface C{
    public void square(int n);
}

interface D{
    void sum(int x,int y);
}