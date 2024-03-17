package code.DesignPrinciples.DesigningBird.v_2;

public class Penguin extends NonFlyable {
    @Override
    public void makeSound() {
        System.out.println("Penguin making sound");
    }

    @Override
    public void nonFly() {
        System.out.println("Penguin cannot fly");
    }
}
