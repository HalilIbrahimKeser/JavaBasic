import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ClockTest {
    @Test
    void test() {
        Clock myClock = new Clock();
        assertEquals(Clock.incrementSeconds(), 1);
    }
}