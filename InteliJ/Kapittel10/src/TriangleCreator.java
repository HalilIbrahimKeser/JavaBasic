public class TriangleCreator extends SimpleGeometricObject {

    public static void main(String[] args) {
            Triangle t1 = new Triangle(2,2,2); print(t1);
            Triangle t2 = new Triangle(4,-1,5); print(t2);
            Triangle t3 = new Triangle(-6); print(t3);
            Triangle t4 = new Triangle(); print(t4);
            Triangle t5 = new Triangle(2.1, 4.0, 6.0); print(t5);
        }

    private static void print(Triangle triangle){
        System.out.println(triangle);
        if (triangle.checkLegality()) {
            System.out.printf("Area of the triangle is: %.2f %n", triangle.getArea());
            System.out.printf("Perimeter of the triangle is: %.2f %n", triangle.getPerimeter());
            System.out.println("The triangle is: " + (triangle.checkLegality() ? "Legal": "Illegal" + ".") +
                    " and " + (triangle.equals(triangle) ? "equal": "not equal") + ".");
        } else {
            System.out.println("The triangle is: " + (triangle.checkLegality() ? "Legal": "Illegal" + "."));
        }
    }
}

