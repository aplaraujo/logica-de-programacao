public class PowerService {
    public PowerResult calculate(int a, int b) {
        int getPower = (int) Math.pow(a, b);
        return new PowerResult(getPower);
    }
}
