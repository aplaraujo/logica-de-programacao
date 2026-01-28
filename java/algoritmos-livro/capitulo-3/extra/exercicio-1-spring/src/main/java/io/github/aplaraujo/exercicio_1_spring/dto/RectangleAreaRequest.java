package io.github.aplaraujo.exercicio_1_spring.dto;

public class RectangleAreaRequest {
    private double width;
    private double height;
    private double meter;

    public RectangleAreaRequest(double width, double height, double meter) {
        this.width = width;
        this.height = height;
        this.meter = meter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMeter() {
        return meter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }
}
