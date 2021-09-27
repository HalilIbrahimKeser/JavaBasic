public class Triangle extends SimpleGeometricObject {
    private double side1, side2, side3;

    Triangle()  {
        super();
        setSide1(1.0); setSide2(1.0); setSide3(1.0);
        setColor("Yellow");
    }
    Triangle(double side)  {
        super();
        setSide1(side); setSide2(side); setSide3(side);
        setColor("Blue"); setFilled();
    }
    Triangle(double side1, double side2, double side3) {
        super();
            setSide1(side1); setSide2(side2); setSide3(side3); setColor("Red"); }

    @Override
    public String toString() {
        return String.format("\nSides: %.2f, %.2f, %.2f, %n%s", getSide1(), getSide2(), getSide3(), super.toString());
    }
    public boolean checkLegality() {
        if (getArea() > 0) {
            return getPerimeter() > 0;
        }
        return false;
    }
    @Override
    public boolean equals (Object other){
        if (other instanceof Triangle) {
            Triangle t = (Triangle) other;
            return (side1 == t.side1 && side2 == t.side2 && side3 == t.side3);
        } return false;
    }

    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt((s*(s - getSide1())*(s - getSide2())*(s - getSide3())));
    }
    double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    private double getSide1() { return side1; }
    private void setSide1(double side1) { this.side1 = side1; }
    private double getSide2() { return side2; }
    private void setSide2(double side2) { this.side2 = side2; }
    private double getSide3() { return side3; }
    private void setSide3(double side3) { this.side3 = side3; }}
