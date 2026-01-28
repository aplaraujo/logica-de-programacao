import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SquareDivisionServiceTest {
    SquareDivisionService service = new SquareDivisionService();

    @ParameterizedTest
    @MethodSource()
    void shouldCalculateSquareCorrectly(int a, int b, int expectedResult) {
        SquareDivisionResult result = service.calculate(a, b);

        Assertions.assertEquals(expectedResult, result.getSquare());
    }

    public static Stream<Arguments> shouldCalculateSquareCorrectly() {
        return Stream.of(
                Arguments.of(10, 2, 25),
                Arguments.of(20, 5, 16),
                Arguments.of(30, 3, 100),
                Arguments.of(4, 2, 4),
                Arguments.of(16, 4, 16)
        );
    }
}
