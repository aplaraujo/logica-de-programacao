public class RectangleResult {
    private final double area;
    private final double perimeter;
    private final double diagonal;

    public RectangleResult(double area, double perimeter, double diagonal) {
        this.area = area;
        this.perimeter = perimeter;
        this.diagonal = diagonal;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getDiagonal() {
        return diagonal;
    }
}
