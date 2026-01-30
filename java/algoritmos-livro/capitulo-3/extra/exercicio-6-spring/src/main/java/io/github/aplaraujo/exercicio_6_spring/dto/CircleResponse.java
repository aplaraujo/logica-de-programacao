package io.github.aplaraujo.exercicio_6_spring.dto;

public class CircleResponse {
    private double area;

    public CircleResponse(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
