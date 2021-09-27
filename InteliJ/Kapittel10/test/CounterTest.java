import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {
    Counter counter;

    @BeforeEach
    public void setup() {
        counter = new Counter();
    }
    @Test
    public void invrementFromZeroShouldIncrementToOne() {
        assertEquals(1,counter.increment());
    }
    @Test
    public void decrementFromZeroShouldNotDecrement() {
        assertEquals(1,counter.increment());
    }
    @Test
    public void decrementAfterIncrementShouldReturZero() {
        assertEquals(1,counter.increment());
        assertEquals(0,counter.decrement());
    }
}
