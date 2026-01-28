import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FootToMeterServiceTest {
    FootToMeterService service = new FootToMeterService();

    @Test
    void shouldCalculateCorrectly() {
        FootToMeterResult result = service.calculate(2.0);
        double expected = 0.6096;

        Assertions.assertEquals(expected, result.getMeter());
    }
}
