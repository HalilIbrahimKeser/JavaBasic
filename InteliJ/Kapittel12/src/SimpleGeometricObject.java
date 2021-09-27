
public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    }
    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() { return color; }

    void setColor(String color) { this.color = color; }

    private boolean isFilled() { return filled; }

    void setFilled() { this.filled = true; }

    //public java.util.Date getDateCreated() { return dateCreated; }

    public String toString() {
        return ("Created on " + dateCreated + ",\nColor: " + color + "\nIs filled: " + (isFilled() ? "Yes" : "No") );
    }
}
