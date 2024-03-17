package code.DesignPrinciples.DesigningBird.v_1;

import code.DesignPrinciples.DesigningBird.v_0.BirdType;

public abstract class Bird {
    private String colour;
    private Integer weight;
    BirdType birdType;
    public abstract void fly();
}
