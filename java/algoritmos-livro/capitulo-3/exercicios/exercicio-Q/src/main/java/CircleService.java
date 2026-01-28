public class CircleService {
    public CircleResult calculate(double radius) {
        double getCircleArea = 3.14159265 * Math.pow(radius, 2);
        return new CircleResult(getCircleArea);
    }
}
