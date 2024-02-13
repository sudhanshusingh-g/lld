package code.LSP.v3;

public class Penguin extends Bird implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Penguins swim!! ");
    }
}
