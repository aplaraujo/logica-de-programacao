import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PredecessorSuccessorServiceTest {
    PredecessorSuccessorService service = new PredecessorSuccessorService();

    @ParameterizedTest
    @MethodSource()
    void shouldCalculatePredecessorAndSuccessorCorrectly(int a, int expectedPredcessor, int expectedSuccessor) {
        PredecessorSuccessorResult result = service.calculate(a);
        Assertions.assertEquals(expectedPredcessor, result.getPredecessor());
        Assertions.assertEquals(expectedSuccessor, result.getSuccessor());
    }

    public static Stream<Arguments> shouldCalculatePredecessorAndSuccessorCorrectly() {
        return Stream.of(
                Arguments.of(27, 26, 28),
                Arguments.of(21, 20, 22),
                Arguments.of(64, 63, 65),
                Arguments.of(6, 5, 7),
                Arguments.of(35, 34, 36),
                Arguments.of(83, 82, 84),
                Arguments.of(14, 13, 15)
        );
    }
}
