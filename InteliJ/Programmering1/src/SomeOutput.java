
public class SomeOutput {
    private int x = 0;
    SomeOutput(int newX) {
        x = newX--;
    }
    public static void main(String[] args) {
        SomeOutput s = new SomeOutput(10);
        System.out.println(s.x);
    }
}
