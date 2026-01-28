public class RootService {
    public RootResult calculate(double base, double index) {
        double root = Math.pow(base, (1 / index));
        return new RootResult(root);
    }
}
