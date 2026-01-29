package io.github.aplaraujo.exercicio_5_spring.dto;

public class ChangeResponse {
    private double total;
    private double change;

    public ChangeResponse(double total, double change) {
        this.total = total;
        this.change = change;
    }

    public double getTotal() {
        return total;
    }

    public double getChange() {
        return change;
    }
}
