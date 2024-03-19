package code.DesignPattern.Creational.Builder;

public class Student {

    String name;
    String email;
    String university;
    Integer age;
    String mobileNumber;

    private Student(Builder b) throws Exception{

        this.age= b.age;
        this.name= b.name;
        this.email= b.email;
        this.university= b.university;
        this.mobileNumber= b.mobileNumber;
    }
    public static Builder getBuilder() {
        return new Builder();
    }
    static class Builder{

        String name;
        String email;
        String university;
        Integer age;
        String mobileNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getUniversity() {
            return university;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public Builder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }
        public Student build() throws Exception {
            if(this.age<18){
                throw new Exception("Age cannot be less than 18");
            }
            if(this.name == null || this.email == null){
                throw  new Exception("Email or name is missing");
            }
            return new Student(this);
        }
    }
}
