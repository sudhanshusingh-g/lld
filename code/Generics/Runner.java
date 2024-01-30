package code.Generics;

public class Runner {
    public static void main(String[] args) {
        GenericExample<Integer> intType=new GenericExample<>(23);
        GenericExample<Double> doubleType=new GenericExample<>(23d);
        GenericExample<String> stringType=new GenericExample<>("Generic is used");
        intType.print();
        doubleType.print();
        stringType.print();
    }
}
