package code.DesignPattern.Creational.Prototype.Registry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegister {
    Map<String,Student> registry;

    private StudentRegister() {
        registry=new HashMap<>();
    }

    private static StudentRegister INSTANCE=null;

    public static StudentRegister getInstance(){
        if(INSTANCE==null){
            INSTANCE=new StudentRegister();
        }
        return INSTANCE;
    }

    public void register(String key,Student s){
        registry.put(key, s);
    }

    public Student get (String key){
        return registry.get(key);
    }
}
