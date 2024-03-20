package code.DesignPattern.Creational.Prototype;

public class Student implements Cloneable {
    private String name;
    private Integer age;
    private String university;

    public Student(String name, Integer age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public Student(Student original){
        this.name = original.name;
        this.age = original.age;
        this.university = original.university;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return new Student(this);
    }
}
