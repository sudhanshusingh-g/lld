package code.AdvanceJava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,3,4,5,6);
        li.stream()
                .map(n->n*n)
                .forEach(x-> System.out.println(x));

    }
}
