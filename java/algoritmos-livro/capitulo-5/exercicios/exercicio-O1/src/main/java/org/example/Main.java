package org.example;

public class Main {
    public static void main(String[] args) {
        int fat, i;
        fat = 1;
        i = 1;

        while(i <= 10) {
            if (i % 2 != 0) {
                fat *= i;
            }
            i++;
        }

        System.out.println("Fatorial: " + fat);
    }
}