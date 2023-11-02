import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestHw {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void testEven(int n){
        assertTrue(n%2==0);
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    void testNotEven(int n){
        assertFalse(n%2==0);
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 37, 58, 99})
    void testNumberInInterval(int n){
        assertTrue(n > 25 && n < 100);
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 12, 157, 100})
    void testNumberNotInInterval(int n){
        assertFalse(n > 25 && n < 100);
    }
}
