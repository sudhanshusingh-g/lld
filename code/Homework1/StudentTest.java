package code.Homework1;

import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student(1L,"Parth","email@email.com","Beginner 2023",80);
//        student.setStudentStatus(StudentStatus.COMPLETED);
//        System.out.println(student.getStudentStatus());
//        System.out.println(student.getRollNumber());
        Mentor mentor=new Mentor(1L,"Tanmay","email@email.com", List.of(student));
        System.out.println(mentor.id+" "+mentor.name+" "+mentor.students);
        mentor.printDetail();
        student.printDetail();
        Mentor mentor1=new Mentor("Bhavik","bhavik@email.com");
        mentor1.printDetail();
    }
}
