package code.DesignPrinciples.DesigningBird.v_4;

public class Penguin extends Bird implements NonFlyable {
    @Override
    public void makeSound() {
        System.out.println("Penguin making sound");
    }

    @Override
    public void nonFly() {
        System.out.println("Penguin cannot fly");
    }
}
