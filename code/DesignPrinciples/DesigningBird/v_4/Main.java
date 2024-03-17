package code.DesignPrinciples.DesigningBird.v_4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Flyable eagle=new Eagle();
//        eagle.fly();
//        Flyable parrot=new Parrot();
//        parrot.fly();
        List<Flyable>flyingBirds= Arrays.asList(new Eagle(),new Parrot());
        for(Flyable fb:flyingBirds){
            fb.fly();
        }
        NonFlyable penguin=new Penguin();
        penguin.nonFly();
    }
}
