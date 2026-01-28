public class OperationResult {
    private final double sum;
    private final double subtract;
    private final double multiply;
    private final double divide;

    public OperationResult(double sum, double subtract, double multiply, double divide) {
        this.sum = sum;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public double getSum() {
        return sum;
    }

    public double getSubtract() {
        return subtract;
    }

    public double getMultiply() {
        return multiply;
    }

    public double getDivide() {
        return divide;
    }
}
