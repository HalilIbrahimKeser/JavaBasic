
public class TestTriangleEx{
    public static void main(String[] args) {

        try {
            TriangleEx t1 = new TriangleEx(3,3,3);
            TriangleEx t2 = new TriangleEx(0,1,1);
        } catch (IllegalTriangleException1 ex) {
            System.out.println(ex);
        }
    }
}