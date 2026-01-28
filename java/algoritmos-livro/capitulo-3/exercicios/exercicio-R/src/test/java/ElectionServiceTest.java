import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElectionServiceTest {
    ElectionService service = new ElectionService();

    @Test
    void shouldReturnTotalOfElectors() {
        ElectionResult result = service.calculate(10, 5, 20, 10, 5);
        int expected = 50;

        Assertions.assertEquals(expected, result.getTotalQuantity());
    }

    @Test
    void shouldReturnValidVotesPercentage() {
        ElectionResult result = service.calculate(10, 5, 20, 10, 5);
        double expected = 70.0;

        Assertions.assertEquals(expected, result.getValidVotesPercentage());
    }

    @Test
    public void shouldReturnCandidateAVotesPercentage() {
        ElectionResult result = service.calculate(10, 5, 20, 10, 5);
        double expected = 20.0;

        Assertions.assertEquals(expected, result.getVotesAPercentage());
    }

    @Test
    public void shouldReturnCandidateBVotesPercentage() {
        ElectionResult result = service.calculate(10, 5, 20, 10, 5);
        double expected = 10.0;

        Assertions.assertEquals(expected, result.getVotesBPercentage());
    }

    @Test
    public void shouldReturnCandidateCVotesPercentage() {
        ElectionResult result = service.calculate(10, 5, 20, 10, 5);
        double expected = 40.0;

        Assertions.assertEquals(expected, result.getVotesCPercentage());
    }

    @Test
    public void shouldReturnCandidateNUllVotesPercentage() {
        ElectionResult result = service.calculate(10, 5, 20, 10, 5);
        double expected = 20.0;

        Assertions.assertEquals(expected, result.getNullVotesPercentage());
    }

    @Test
    public void shouldReturnCandidateBlankVotesPercentage() {
        ElectionResult result = service.calculate(10, 5, 20, 10, 5);
        double expected = 10.0;

        Assertions.assertEquals(expected, result.getBlankVotesPercentage());
    }
}
