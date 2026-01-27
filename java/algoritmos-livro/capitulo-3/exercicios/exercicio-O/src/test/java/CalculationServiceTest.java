import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculationServiceTest {
    private final CalculationService service = new CalculationService();

    @Test
    void shouldCalculateProductAndSumCorrectly() {
        int A = 18;
        int B = 2;
        int C = 41;
        int D = 54;
        int productExpected = 738;
        int sumExpected = 56;

        CalculationResult result = service.calculate(A, B, C, D);
        int productActual = result.getProduct();
        int sumActual = result.getSum();

        Assertions.assertEquals(productExpected, productActual);
        Assertions.assertEquals(sumExpected, sumActual);
    }
}

