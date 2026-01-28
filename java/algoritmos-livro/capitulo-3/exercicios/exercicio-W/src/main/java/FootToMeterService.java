public class FootToMeterService {
    public FootToMeterResult calculate(double foot) {
        double getMeters = foot * 0.3048;
        return new FootToMeterResult(getMeters);
    }
}
