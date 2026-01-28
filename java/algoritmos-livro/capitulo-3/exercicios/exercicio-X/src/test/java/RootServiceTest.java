import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RootServiceTest {
    RootService service = new RootService();

    @Test
    void shouldCalculateRootCorrectly() {
        RootResult result = service.calculate(6.0, 4.0);
        double expected = 1.5650845800732873;

        Assertions.assertEquals(expected, result.getRoot());
    }
}
