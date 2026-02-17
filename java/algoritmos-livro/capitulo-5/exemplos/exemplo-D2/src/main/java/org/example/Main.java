package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while(i <= 10);

        sc.close();
    }
}