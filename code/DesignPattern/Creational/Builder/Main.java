package code.DesignPattern.Creational.Builder;

public class Main {
    public static void main(String[] args) throws Exception {
        Student b=Student.getBuilder()
                .setAge(125)
                .setMobileNumber("+123")
                .setName("Sudhanshu")
                .setEmail("email@email.com")
                .build();



    }
}
