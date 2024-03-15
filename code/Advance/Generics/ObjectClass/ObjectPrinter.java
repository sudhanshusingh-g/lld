package code.Advance.Generics.ObjectClass;

public class ObjectPrinter {
    Object objToPrint;

    public ObjectPrinter(Object objToPrint) {
        this.objToPrint = objToPrint;
    }
    public void printObj(){
        System.out.println(objToPrint);
    }

    public Object getObjToPrint() {
        return objToPrint;
    }
}
