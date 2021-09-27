

public class IllegalTriangleException1 extends Exception {
    private double side1, side2, side3;;

    /** Construct an exception */
    public IllegalTriangleException1(double side1, double side2, double side3) {
        super("Invalid triangle " + side1 + " " + side2 + " " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}