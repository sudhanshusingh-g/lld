package Homework1;

import java.util.ArrayList;
import java.util.List;

public class Mentor {
    Long id;
    String name;
    String email;
    List<Student> students=new ArrayList<>();

    public Mentor(Long id, String name, String email, List<Student> students) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.students = students;
    }
}
