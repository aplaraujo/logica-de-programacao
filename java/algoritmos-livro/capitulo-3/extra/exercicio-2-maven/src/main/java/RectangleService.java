public class RectangleService {
    public RectangleResult calculate(double width, double height) {
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        return new RectangleResult(area, perimeter, diagonal);
    }
}
