package code.DesignProblems.Pen.v1;

public class Refill {
    private RefillType refillType;
    Ink ink;
    Nib nib;
    boolean refillable;

    public boolean isRefillable() {
        return !refillable;
    }
}
