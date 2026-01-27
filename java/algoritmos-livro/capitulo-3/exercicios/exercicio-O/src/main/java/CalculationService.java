public class CalculationService {

    public CalculationResult calculate(int a, int b, int c, int d) {
        int product = a * c;
        int sum = b + d;

        return new CalculationResult(product, sum);
    }
}
