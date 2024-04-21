package code.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("A",24));
        personList.add(new Person("B",32));
        personList.add(new Person("C",12));

        Collections.sort(personList);

        for (Person person:personList){
            System.out.println(person.getName()+" "+person.getAge());
        }
    }
}
