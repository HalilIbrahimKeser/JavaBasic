import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FlyReservasjonTest {
    private Rad r;
    private FlyReservasjon fr;
    @BeforeEach
    void setUp() {
        r = new Rad();
        fr = new FlyReservasjon();
    }
    @Test
    void isLegalSeat_CheckIfSeatIsInTheRightFormTrue() {
        char expectedSeat = 'A';
        assertTrue(r.isLegalSeat(expectedSeat));
    }
    @Test
    void isLegalSeat_CheckIfSeatIsInTheRightFormFalse() {
        char expectedSeat = 'G';
        assertFalse(r.isLegalSeat(expectedSeat));
    }
    @Test
    void assignSeat_AssignTheSeatIfNotOccupied() {
        char expectedSeat = 'C';
        assertTrue(r.assignSeat(expectedSeat));
    }
    @Test
    void reserveSeat_reserveTheSeatIfNotOccupied() {
        char expectedSeat = 'C';
        int expectedRow = 1;
        assertTrue(fr.reserveSeat(expectedRow, expectedSeat));
    }
}