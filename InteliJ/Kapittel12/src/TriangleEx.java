
public class TriangleEx extends SimpleGeometricObject {
    private double side1, side2, side3;

    public TriangleEx() {
        super("Yellow", false);
        side1 = side2 = side3 = 1.0;
    }

    public TriangleEx(double side) throws IllegalTriangleException1 {
        super("Blue", true);
        if (checkLegality(side, side, side))
            side1 = side2 = side3 = side;
        else
            side1 = side2 = side3 = 1.0;
    }

    public TriangleEx(double side1, double side2, double side3) throws IllegalTriangleException1 {
        if (checkLegality(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else
            this.side1 = this.side2 = this.side3 = 1.0;
    }

    public double getSide1() {return side1;}
    public void setSide1(double side1) {this.side1 = side1;} // sjekk!??
    public double getSide2() {return side2;}
    public void setSide2(double side2) {this.side2 = side2;} // sjekk!??
    public double getSide3() {return side3;}
    public void setSide3(double side3) {this.side3 = side3;	} // sjekk!??

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public String toString() {
        return String.format("Sides: %.2f, %.2f, %.2f %n%s", getSide1(), getSide2(), getSide3(), super.toString());
    }

    public boolean checkLegality(double side1, double side2, double side3) throws IllegalTriangleException1 {
        if (side1 < 0 || side2 < 0 || side3 < 0)
            throw new IllegalTriangleException1(side1, side2, side3);
        if (side1 >= side2 + side3 || side1 <= Math.abs(side3 - side2))
            throw new IllegalTriangleException1(side1, side2, side3);
        return true;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof TriangleEx) {
            TriangleEx t = (TriangleEx) other;
            return (side1 == t.side1 && side2 == t.side2 && side3 == t.side3);
        }
        return false;
    }
}
