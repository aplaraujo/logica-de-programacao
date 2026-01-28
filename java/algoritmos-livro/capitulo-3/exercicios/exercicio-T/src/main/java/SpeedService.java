public class SpeedService {
    public SpeedResult calculate(double distance, double time) {
        double speed = (distance * 1000.0) / (time * 60.0);
        return new SpeedResult(speed);
    }
}
