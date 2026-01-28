public class SquareDivisionService {
    public SquareDivisionResult calculate(int a, int b) {
        int division = a / b;
        int square = division * division;
        return new SquareDivisionResult(square);
    }
}
