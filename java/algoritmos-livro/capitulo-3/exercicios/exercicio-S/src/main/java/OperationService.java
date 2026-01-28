public class OperationService {
    public OperationResult calculate(double a, double b) {
        double sum = a + b;
        double subtract = a - b;
        double multiply = a * b;
        double divide = a / b;

        return new OperationResult(sum, subtract, multiply, divide);
    }
}
