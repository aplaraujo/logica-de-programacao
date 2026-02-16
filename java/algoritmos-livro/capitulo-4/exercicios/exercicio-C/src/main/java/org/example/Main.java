package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, n4, media;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Média: " + media);

        if (media < 5) {
            System.out.println("Repetiu de ano!");
        } else {
            System.out.println("Passou de ano!");
        }

        sc.close();
    }
}