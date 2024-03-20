package code.DesignPattern.Creational.Prototype;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=getStudent();
        Student cloned=student.clone();
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
