package code.DesignPattern.Creational.Singleton;

public class Synchronized {
    private Synchronized(){}
    private static Synchronized INSTANCE=new Synchronized();
    public static synchronized Synchronized getInstance(){
        return INSTANCE;
    }
}
