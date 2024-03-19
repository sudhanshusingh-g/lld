package code.DesignPattern.Creational.Singleton;

public class DCL {
    private DCL(){}
    private static DCL INSTANCE=null;
    public static DCL getInstance(){
        if(INSTANCE==null){
            synchronized (DCL.class){
                if(INSTANCE==null){
                    INSTANCE=new DCL();
                }
            }
        }
        return INSTANCE;
    }
}
