package Homework1;

public class User {
    Long id;
    String name;
    String email;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public User(String name,String email){
        this.email=email;
        this.name=name;
    }
//    Print name and email
    public void  printDetail(){
        System.out.println(name+"("+email+")");
    }
}
