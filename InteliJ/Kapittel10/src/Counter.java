public class Counter {
    private int count = 0;

    int increment() {
        if ( count < Integer.MAX_VALUE)
            count += 1;
        return count;
    }
    public int increment(int value){
        if (count + value < Integer.MAX_VALUE)
            count += value;
        return count;
    }
    int decrement() {
        if (count > 0) count -= 1;
        return count;
    }
}
