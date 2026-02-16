package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, n4, media, extra, media2;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.println("Passou de ano!");
            System.out.println("Média: " + media);
        } else  {
            extra = sc.nextDouble();
            media2 = (media + extra) / 2;

            if (media2 >= 5) {
                System.out.println("Passou de ano!");
                System.out.println("Média: " + media2);
            } else {
                System.out.println("Repetiu de ano!");
                System.out.println("Média: " + media2);
            }
        }

        sc.close();
    }
}