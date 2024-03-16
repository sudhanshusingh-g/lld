package code.AdvanceJava.Generics.ObjectClass;

public class Main {
    public static void main(String[] args) {
        ObjectPrinter obj=new ObjectPrinter(23);
//        obj.printObj();
        Integer i=(Integer) obj.getObjToPrint();
        ObjectPrinter obj1=new ObjectPrinter(23d);
//        obj1.printObj();
        Double d=(double) obj1.getObjToPrint();
        ObjectPrinter obj2=new ObjectPrinter("Hello");
//        obj2.printObj();
        Integer s=(Integer) obj2.getObjToPrint();
    }
}
