import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest extends SimpleGeometricObject {
    private Triangle triangle;
    private Triangle triangle2;

    @BeforeEach
    void setUp() {
        triangle = new Triangle();
        triangle2 = new Triangle(1,2,3);
    }

    @Test
    void checkLegality_checkIfTriangleIsLegal() {
        assertTrue(triangle.checkLegality());
    }

    @Test
    void checkLegality_checkIfTriangleIsLegal2() {
        assertFalse(triangle2.checkLegality());
    }

    @Test
    void getArea_checkIfGetAreaIsCorrect() { double area = triangle.getArea();
        assertEquals(area, triangle.getArea()); }

    @Test
    void getPerimeter_checkIfGetPerimeterIsCorrect() { double peri = triangle.getPerimeter();
        assertEquals(peri, triangle.getPerimeter()); }
}