import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RectangleAreaServiceTest {
    RectangleAreaService service = new RectangleAreaService();

    @DisplayName("Should calculate area and price correctly")
    @Test
    void shouldCalculateAreaAndPriceCorrectly() {
        RectangleAreaResult result = service.calculate(10.0, 30.0, 200.00);
        double areaExpected = 300.0;
        double priceExpected = 60000.0;

        assertEquals(areaExpected, result.getArea());
        assertEquals(priceExpected, result.getPrice());
    }
}
