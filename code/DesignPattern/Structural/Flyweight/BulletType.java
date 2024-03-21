package code.DesignPattern.Structural.Flyweight;

//Concrete flyweight representing bullet
public class BulletType implements Bullet{
    private String type;
    public BulletType(String type){
        this.type=type;
    }

    @Override
    public void shoot(int x, int y) {
        System.out.println("Shooting"+type+" bullet at position ( "+x+" , "+y+" )");
    }
    public String getType(){
        return type;
    }
}
