package code.DesignPattern.Creational.Singleton;

public class EagerInitialization {
    private EagerInitialization(){}
    private static EagerInitialization INSTANCE=new EagerInitialization();
     public static EagerInitialization getInstance(){
         return INSTANCE;
     }
}
