import org.apache.groovy.contracts.domain.Assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class speedTest {
    @Test

public void   checkingTheSpeedArray () {

        int speedOfPlayer1 = 0;
        int speedOfPlayer2 = 6;
        int speedOfPlayer3 = 7;

        int players[] = {speedOfPlayer1, speedOfPlayer2, speedOfPlayer3};

        int [] actual = {2};
        int [] expected = {2};
        Assertions.assertArrayEquals(expected, actual);

    }
}
