public class RectangleAreaService {
    public RectangleAreaResult calculate(double width, double height, double meter) {
        double area = width * height;
        double price = area * meter;

        return new RectangleAreaResult(area, price);
    }
}
