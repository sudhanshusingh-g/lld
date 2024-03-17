package code.DesignPrinciples.DesigningBird.v_2;

public class Eagle extends Flyable {
    @Override
    public void makeSound() {
        System.out.println("Eagle sound");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flying!");
    }
}
