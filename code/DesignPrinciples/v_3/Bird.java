package code.DesignPrinciples.v_3;

import code.DesignPrinciples.v_0.BirdType;

public abstract class Bird {
    private String colour;
    private Integer weight;
    BirdType birdType;
    public abstract void makeSound();
}
