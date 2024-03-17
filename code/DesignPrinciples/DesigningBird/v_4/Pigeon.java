package code.DesignPrinciples.DesigningBird.v_4;

import code.DesignPrinciples.DesigningBird.v_3.Bird;

public class Pigeon extends Bird implements Flyable {
    FlyingBehaviour pp=new SPFB();
    @Override
    public void makeSound() {
        System.out.println("Parrot making sound");
    }

    @Override
    public void fly() {
        pp.makeFly();

    }
}
