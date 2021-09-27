public class TestTriangleWithCustomException {
    public static void main(String[] args) {
        try {
            new TriangleWithCustomException(2,2,2);
            new TriangleWithCustomException(4,-1,5);
            new TriangleWithCustomException(-6);
            new TriangleWithCustomException();
            new TriangleWithCustomException(2.1, 4.0, 6.0);
            new TriangleWithCustomException(6,6,6);
            new TriangleWithCustomException(-1,-2,-9);
        }
        catch (IllegalTriangleException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of objects created: " + TriangleWithCustomException.getNumberOfObjects());
    }
}
class TriangleWithCustomException {
    private double side1, side2, side3;
    private static int numberOfObjects = 0;

    TriangleWithCustomException() throws IllegalTriangleException {
        setSide1(1.0); setSide2(1.0); setSide3(1.0);
        if (checkLegality())
            numberOfObjects++;
    }
    TriangleWithCustomException(double side) throws IllegalTriangleException {
        setSide1(side); setSide2(side); setSide3(side); setColor("Pink");
        if (checkLegality())
            numberOfObjects++;
    }
    TriangleWithCustomException(double side1, double side2, double side3) throws IllegalTriangleException {
        setSide1(side1); setSide2(side2); setSide3(side3); setColor("Red");
        if (checkLegality()) {
            numberOfObjects++;
        }
    }

    private boolean checkLegality() throws IllegalTriangleException {
        if (getArea() > 0) {
            return getPerimeter() > 0;
        }return false;
    }

    private void setColor(String color) { }

    static int getNumberOfObjects() { return numberOfObjects; }

    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt((s*(s - getSide1())*(s - getSide2())*(s - getSide3())));
    }

    private double getPerimeter() { return getSide1() + getSide2() + getSide3();
    }

    boolean equals(TriangleWithCustomException equals) {
        return getSide1() == getSide2() && getSide3() == getSide1();
    }

    private double getSide1() { return side1; }
    private void setSide1(double side1)  { this.side1 = side1; }
    private double getSide2() { return side2; }
    private void setSide2(double side2)  { this.side2 = side2; }
    private double getSide3() { return side3; }
    private void setSide3(double side3) { this.side3 = side3; }
}
