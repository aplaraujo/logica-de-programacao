package org.example;

public class SumService {
    public SumResult calculate(int a, int b) {
        int sum = a + b;
        return new SumResult(sum);
    }
}
