package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;

        while(i <= 10) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}