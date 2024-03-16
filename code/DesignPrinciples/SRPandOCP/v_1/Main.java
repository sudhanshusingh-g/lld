package code.DesignPrinciples.SRPandOCP.v_1;

public class Main {
    public static void main(String[] args) {
        Bird eagle=new Eagle();
        eagle.fly();
        Bird parrot=new Parrot();
        parrot.fly();
    }
}
