package code.DesignPattern.Structural.Flyweight;

public class ShootingGame {
    public static void main(String[] args) {
        BulletFactory bulletFactory=new BulletFactory();

//        Palayer shooting
        shootBullet(bulletFactory,"AKM",200,100);
        shootBullet(bulletFactory,"M416",100,400);
        shootBullet(bulletFactory,"Uzi",150,500);
        shootBullet(bulletFactory,"Pistol",230,400);
        shootBullet(bulletFactory,"Shotgun",120,380);

    }

    private static void shootBullet(BulletFactory bulletFactory,String type,int x,int y){
        Bullet bullet= bulletFactory.getBullet(type);
        bullet.shoot(x,y);
    }
}
