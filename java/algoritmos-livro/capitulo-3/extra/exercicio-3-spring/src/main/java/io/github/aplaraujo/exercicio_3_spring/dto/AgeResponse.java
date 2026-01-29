package io.github.aplaraujo.exercicio_3_spring.dto;

public class AgeResponse {
    private double average;

    public AgeResponse(double average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }
}
