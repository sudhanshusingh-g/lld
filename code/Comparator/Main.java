package code.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 25));
        personList.add(new Person("Charlie", 35));

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Person person:personList){
            System.out.println(person.getName()+" "+person.getAge());
        }
    }
}
