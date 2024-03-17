package code.DesignPrinciples.DesigningBird.v_3;

public class Parrot extends Bird implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("Parrot mimics");
    }

    @Override
    public void fly() {
        System.out.println("Parrot flying!");
    }
}
