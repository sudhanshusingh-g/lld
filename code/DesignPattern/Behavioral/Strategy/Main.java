package code.DesignPattern.Behavioral.Strategy;


//Usage
public class Main {
    public static void main(String[] args) {
        AttackStrategy swordAttack=new SwordAttack();
        AttackStrategy bowAttack=new BowAttack();

        Character newCharacter=new Character(swordAttack);
        newCharacter.attack();

        newCharacter.setAttackStrategy(bowAttack);
        newCharacter.attack();
    }
}
