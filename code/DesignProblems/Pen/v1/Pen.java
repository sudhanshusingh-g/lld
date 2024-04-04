package code.DesignProblems.Pen.v1;

public class Pen {
    private String brand;
    private String name;
    private PenType type;
    private double price;
    private Refill refill;
    private Ink ink;
    private Nib nib;

    public void write() {
        switch (type) {
            case GEL:
                System.out.println("Gel Pen writes");
                break;
            case BALL:
                System.out.println("Ball Pen writes");
                break;
            case FOUNTAIN:
                System.out.println("Fountain Pen writes");
                break;
            case MARKER:
                System.out.println("Marker Pen writes");
                break;
            case THROW_AWAY:
                System.out.println("Throwaway Pen writes");
                break;
        }

        throw new IllegalArgumentException("Invalid Pen Type");
    }

    public void changeRefill(Refill refill) {
        if (this.refill.isRefillable()) {
            this.refill = refill;
        }
    }

    public void changeInk(Ink ink) {
        this.ink = ink;
    }
}
