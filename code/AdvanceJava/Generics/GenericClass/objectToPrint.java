package code.AdvanceJava.Generics.GenericClass;

public class objectToPrint<T> {
    T obj;

    public objectToPrint(T obj) {
        this.obj = obj;
    }
    public void print(){
        System.out.println(obj);
    }
    public T get(){
        return obj;
    }
}
