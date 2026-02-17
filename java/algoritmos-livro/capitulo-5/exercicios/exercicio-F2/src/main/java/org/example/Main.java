package org.example;

public class Main {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 200; i++) {
            if (i % 4 == 0 && i < 200) {
                System.out.println(i);
            }
        }
    }
}