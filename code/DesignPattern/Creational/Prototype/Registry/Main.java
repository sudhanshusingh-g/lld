package code.DesignPattern.Creational.Prototype.Registry;

import java.util.Random;

public class Main {
    public static final String STUDENT_KEY = "STUDENT";
    public static final String INTELLIGENT_STUDENT_KEY = "INTELLIGENT_STUDENT";

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=getStudent();
        Student cloned=student.clone();

        StudentRegister studentRegister=StudentRegister.getInstance();

        IntelligentStudent intStudent=(IntelligentStudent) studentRegister.get(INTELLIGENT_STUDENT_KEY);
        IntelligentStudent clonedStudent=intStudent.clone();
    }

    public void setupRegister(){
        StudentRegister registery=StudentRegister.getInstance();

        Student protoStudent=new Student("Hel1",23,"stfu");
        IntelligentStudent protoIntelliStudent=new IntelligentStudent("er",12,"csu",120);

        registery.register(STUDENT_KEY,protoStudent);
        registery.register(INTELLIGENT_STUDENT_KEY,protoIntelliStudent);
    }
    public static Student getStudent(){
        Random random=new Random();
        int n= random.nextInt();
        if(n%2==0){
            return new Student("Sud",20,"hhd");
        }
        else{
            return new IntelligentStudent("JJ",24,"stfu",12);
        }
    }
}
