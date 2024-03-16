package code.DesignPrinciples.v_0;

public class Bird {
//    States/Data members
    private String colour;
    private Integer weight;
    BirdType birdType;

    public String getColour() {
        return colour;
    }

    public Bird(String colour, Integer weight, BirdType birdType) {
        this.colour = colour;
        this.weight = weight;
        this.birdType = birdType;
    }

    public Integer getWeight() {
        return weight;
    }

    public BirdType getBirdType() {
        return birdType;
    }

    //    Behaviours/Methods
    public void fly(){
        if(birdType==BirdType.EAGLE){
            System.out.println("Eagle fly");
        }
        else if(birdType==BirdType.PARROT){
            System.out.println("Parrot fly");
        }
        else if(birdType==BirdType.VULTURE){
            System.out.println("Vulture fly");
        }
        else if(birdType==BirdType.SEAGULL){
            System.out.println("Seagull fly");
        }
    }
}
