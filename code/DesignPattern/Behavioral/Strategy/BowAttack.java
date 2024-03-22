package code.DesignPattern.Behavioral.Strategy;

public class BowAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Attacking with bow");
    }
}
