package code.Homework1;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends User {

    List<Student> students=new ArrayList<>();

    public Mentor(Long id, String name, String email, List<Student> students) {
        super(id, name, email);
        this.students = students;
    }
    public Mentor(String name, String email){
        super(name,email);
    }
}
