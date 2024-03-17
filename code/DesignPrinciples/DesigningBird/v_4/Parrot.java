package code.DesignPrinciples.DesigningBird.v_4;

public class Parrot extends Bird implements Flyable {
    FlyingBehaviour pp=new SPFB();
    @Override
    public void makeSound() {
        System.out.println("Parrot mimics");
    }

    @Override
    public void fly() {
        pp.makeFly();

    }
}
