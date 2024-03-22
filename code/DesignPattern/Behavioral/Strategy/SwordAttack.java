package code.DesignPattern.Behavioral.Strategy;

//Concrete Strategy
public class SwordAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Attacking with sword!");
    }
}
