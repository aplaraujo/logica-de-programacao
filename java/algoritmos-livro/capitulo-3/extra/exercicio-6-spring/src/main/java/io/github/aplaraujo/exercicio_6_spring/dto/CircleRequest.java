package io.github.aplaraujo.exercicio_6_spring.dto;

public class CircleRequest {
    private double radius;

    public CircleRequest(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
