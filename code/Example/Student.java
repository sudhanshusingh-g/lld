package code.Example;

public class Student {
    private String name;
    private String email;
    private  Integer age;
    private String batchName;
    private Integer psp;
//Setter
    public void setName(String name) {
        this.name = name;
    }
// Getter

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Parameterised Constructor
    public Student(String name,String email){
        this.name=name;
        this.email=email;
    }
    public void changeBatch(String batchName){
        this.batchName=batchName;
        System.out.println("Batch changed from "+this.batchName+" to "+batchName);
    }

    public void add(double a,float b){
        System.out.println(a+b);
    }
    public void add(float a,double b){
        System.out.println(a+b);
    }

}
