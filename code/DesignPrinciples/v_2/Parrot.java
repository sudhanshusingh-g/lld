package code.DesignPrinciples.v_2;

public class Parrot extends Flyable {
    @Override
    public void makeSound() {
        System.out.println("Parrot mimics");
    }

    @Override
    public void fly() {
        System.out.println("Parrot flying!");
    }
}
