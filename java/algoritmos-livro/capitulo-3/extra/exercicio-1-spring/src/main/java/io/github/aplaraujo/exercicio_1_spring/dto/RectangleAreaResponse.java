package io.github.aplaraujo.exercicio_1_spring.dto;

public class RectangleAreaResponse {
    private double area;
    private double price;

    public RectangleAreaResponse(double area, double price) {
        this.area = area;
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }
}
