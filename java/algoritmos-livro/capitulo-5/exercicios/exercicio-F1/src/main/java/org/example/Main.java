package org.example;

public class Main {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 200) {
            if (i % 4 == 0 && i < 200) {
                System.out.println(i);
            }
            i++;
        }
    }
}