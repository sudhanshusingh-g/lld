package code.DesignPattern.Behavioral.Strategy;


//Context
public class Character {
    private AttackStrategy attackStrategy;

    public Character(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.attackStrategy=attackStrategy;
    }

    public void attack(){
        attackStrategy.attack();
    }
}
