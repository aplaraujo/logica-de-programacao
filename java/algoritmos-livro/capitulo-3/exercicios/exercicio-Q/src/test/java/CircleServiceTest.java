import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleServiceTest {
    private final CircleService service = new CircleService();

    @Test
    void shouldCalculateCircleAreaCorrectly() {
        double radius = 63.0;
        double expected = 12468.981227850001;
        CircleResult actual = service.calculate(radius);

        Assertions.assertEquals(expected, actual.getArea());
    }
}
