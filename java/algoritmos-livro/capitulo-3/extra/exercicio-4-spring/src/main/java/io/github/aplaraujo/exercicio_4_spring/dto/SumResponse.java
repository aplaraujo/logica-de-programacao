package io.github.aplaraujo.exercicio_4_spring.dto;

public class SumResponse {
    private final int sum;

    public SumResponse(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
}
