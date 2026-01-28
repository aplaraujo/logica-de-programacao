import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationServiceTest {
    OperationService service = new OperationService();

    @Test
    void shouldCalculateSumCorrectly() {
        OperationResult result = service.calculate(10.0, 5.0);
        double expected = 15.0;

        Assertions.assertEquals(expected, result.getSum());
    }

    @Test
    void shouldCalculateSubtractionCorrectly() {
        OperationResult result = service.calculate(10.0, 5.0);
        double expected = 5.0;

        Assertions.assertEquals(expected, result.getSubtract());
    }

    @Test
    void shouldCalculateMultiplicationCorrectly() {
        OperationResult result = service.calculate(10.0, 5.0);
        double expected = 50.0;

        Assertions.assertEquals(expected, result.getMultiply());
    }

    @Test
    void shouldCalculateDivisionCorrectly() {
        OperationResult result = service.calculate(10.0, 5.0);
        double expected = 2.0;

        Assertions.assertEquals(expected, result.getDivide());
    }
}
