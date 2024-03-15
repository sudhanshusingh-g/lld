package code.Advance.Generics.GenericClass;

public class Main {
    public static void main(String[] args) {
        objectToPrint<String> s=new objectToPrint<String>("Hello");
        objectToPrint<Integer> i=new objectToPrint<Integer>(12);
        objectToPrint<Double> d=new objectToPrint<Double>(1d);
        s.print();
        i.print();
        int getInteger=i.get();
        d.print();
        double getDouble=d.get();

        Pair<Integer,String> p1=new Pair<>(1,"Sudhanshu");
        Pair<Integer,Pair<Integer,String>> p2=new Pair<>(2,p1);
    }
}
