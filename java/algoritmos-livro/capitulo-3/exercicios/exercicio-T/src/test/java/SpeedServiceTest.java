import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedServiceTest {
    SpeedService service = new SpeedService();

    @Test
    void shouldCalculateSpeedCorrectly() {
        SpeedResult result = service.calculate(4.0, 5.0);
        double expected = 13.333333333333334;
        Assertions.assertEquals(expected, result.getSpeed());
    }
}
