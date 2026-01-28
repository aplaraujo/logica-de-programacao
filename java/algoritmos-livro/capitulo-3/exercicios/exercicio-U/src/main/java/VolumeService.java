public class VolumeService {
    public VolumeResult calculate(double radius) {
        double getRadius = (4.0/3.0) * 3.14159 * Math.pow(radius, 3);
        return new VolumeResult(radius);
    }
}
