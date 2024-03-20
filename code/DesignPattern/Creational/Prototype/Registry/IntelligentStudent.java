package code.DesignPattern.Creational.Prototype.Registry;

public class IntelligentStudent extends Student {
    private Integer iq;

    public IntelligentStudent(String name, Integer age, String university, Integer iq) {
        super(name, age, university);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent original) {
        super(original);
        this.iq = original.iq;
    }

    @Override
    protected IntelligentStudent clone() throws CloneNotSupportedException {
        return new IntelligentStudent(this);
    }
}
