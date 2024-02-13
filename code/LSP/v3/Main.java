package code.LSP.v3;


public class Main {
    public static void main(String[] args) {
        Flyable b=new Eagle();
        b.fly();
        Swimmable b1=new Penguin();
        b1.swim();
        Swan s=new Swan();
        s.swim();
        s.fly();
    }
}
