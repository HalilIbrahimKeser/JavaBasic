import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TestPassword  extends Password{

    @ParameterizedTest
    @ValueSource (strings = { "kjf@==%&", "gggg45", "lkdfdrewdos", "kjl456"})
    void checkPasswordAllShouldReturnFalse(String input) {
        assertFalse(Password.checkPassword(input));
    }
}
