package Modul8;

public class TestRectangle {
    public static void main(String[] args) {

        MyRectangle myRectangle = new MyRectangle(4, 40);
        System.out.printf("Rektangel med sider: %4.2f og %5.2f%n",
                myRectangle.getWidth(), myRectangle.getHeight());
        System.out.printf("Har arealet lik: %10.2f %n",
                myRectangle.getArea());
        System.out.printf("Og omkretsen lik: %8.2f %n%n",
                myRectangle.getPerimeter());

        MyRectangle yourRectangle = new MyRectangle();
        yourRectangle.setHeight(5.4);
        yourRectangle.setWidth(6.3);

        System.out.printf("Rektangel med sider: %4.2f og %4.2f%n",
                yourRectangle.getWidth(), yourRectangle.getHeight());
        System.out.printf("Har arealet lik: %9.2f %n",
                yourRectangle.getArea());
        System.out.printf("Og omkretsen lik: %8.2f %n%n",
                yourRectangle.getPerimeter());
    }
}
class MyRectangle {
    // Datamedlemmer.
    private double width, height;

    // Tomt konstruktør, setter bredde og lengde til 1.
    public MyRectangle() {
        width = 1;
        height = 1;
    }
    // Argument konstruktør, setter bredde og lendge til oppgitte verdier.
    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
}
