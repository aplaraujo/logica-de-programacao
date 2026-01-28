package io.github.aplaraujo.exercicio_2_spring.dto;

public class RectangleResponse {
    private double area;
    private double perimeter;
    private double diagonal;

    public RectangleResponse(double area, double perimeter, double diagonal) {
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
