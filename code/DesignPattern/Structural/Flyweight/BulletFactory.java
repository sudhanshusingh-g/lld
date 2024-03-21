package code.DesignPattern.Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class BulletFactory {
    private static final String[] bulletTypes = { "Pistol", "Rifle", "Shotgun" };
    private List<Bullet> bullets = new ArrayList<>();

    public Bullet getBullet(String type) {
        for (Bullet bullet : bullets) {
            if (((BulletType) bullet).getType().equalsIgnoreCase(type)) {
                return bullet;
            }
        }
        Bullet newBullet = new BulletType(type);
        bullets.add(newBullet);
        return newBullet;
    }
}
