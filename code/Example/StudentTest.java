package code.Example;

public class StudentTest {
    public static void main(String[] args) {
        //Student s1=new Student();// Default constructor
//        Parameterised constructor
        Student s1=new Student("Eklavya","email@email.com");
        System.out.println(s1.getEmail());
        s1.add(1,2.0);
    }
}
