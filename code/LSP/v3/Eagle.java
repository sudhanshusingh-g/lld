package code.LSP.v3;


public class Eagle extends Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Eagle is flying!!");
    }
}
