package code.Generics;

public class GenericExample<T> {
    T typeToPrint;

    public GenericExample(T typeToPrint) {
        this.typeToPrint = typeToPrint;
    }
    public void print(){
        System.out.println(typeToPrint);
    }
}
