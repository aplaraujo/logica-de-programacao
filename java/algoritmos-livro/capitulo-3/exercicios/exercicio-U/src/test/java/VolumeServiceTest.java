import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeServiceTest {
    VolumeService service = new VolumeService();

    @Test
    void shouldCalculateVolumeCorrectly() {
        VolumeResult result = service.calculate(3.0);
        double expected = 3.0;

        Assertions.assertEquals(expected, result.getVolume());
    }
}
