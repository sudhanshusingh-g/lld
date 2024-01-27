package Homework1;

public class Student extends User {
    public static String PREFIX="SS";
//    States
//    rollNumber
//    Long id;
////    name - String
//    String name;
////    email - String
//    String email;
//    psp
    Integer psp;
//    BatchName
    String batchName;
//    status
    StudentStatus studentStatus;
 public Student(Long id,String name,String email,String batchName,Integer psp){
//     if(psp<0 || psp  >100){
//         throw new IllegalArgumentException("Invalid psp.PSP should be in bewtween 0 to 100");
//     }
//     this.id=id;
//     this.name=name;
//     this.email=email;
//     this.psp=psp;
//     this.batchName=batchName;
//     this.studentStatus= StudentStatus.ACTIVE;
     super(id, name, email);
     this.psp=psp;
     this.batchName=batchName;
     this.studentStatus= StudentStatus.ACTIVE;

 }
public void setStudentStatus(StudentStatus studentStatus){
//     active and paused
    this.studentStatus=studentStatus;
}

    public StudentStatus getStudentStatus() {
        return studentStatus;
    }

    public Integer getPsp() {
        return psp;
    }
    public String getRollNumber(){
     return PREFIX+this.batchName.replaceAll("\\s","")+this.id;
    }
}
