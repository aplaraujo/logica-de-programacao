import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerServiceTest {
    PowerService service = new PowerService();

    @Test
    void shouldCalculatePowerCorrectly() {
        PowerResult result = service.calculate(5, 7);
        int expected = 78125;

        Assertions.assertEquals(expected, result.getPower());
    }
}
