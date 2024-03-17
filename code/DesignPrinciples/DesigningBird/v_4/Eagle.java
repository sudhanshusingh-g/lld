package code.DesignPrinciples.DesigningBird.v_4;

public class Eagle extends Bird implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("Eagle sound");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flying!");
    }
}
