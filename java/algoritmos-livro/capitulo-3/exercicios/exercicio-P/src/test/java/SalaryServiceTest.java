import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryServiceTest {

    private final SalaryService service = new SalaryService();

    @Test
    void shouldCalculateNewSalaryCorrectly() {
        double monthlySalary = 2327.00;
        double raisePercentage = 11.0;
        double expected = 2582.97;
        SalaryResult result = service.calculate(monthlySalary, raisePercentage);

        Assertions.assertEquals(expected, result.getNewSalary());
    }
}
