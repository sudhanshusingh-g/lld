package code.Generics.pair;

public class Printer<T> {


        T thingToPrint;

        public Printer(T thingToPrint) {
            this.thingToPrint = thingToPrint;
        }

        public void print(){
            System.out.println(thingToPrint);
        }

        public T get(){
            return thingToPrint;
        }

}
