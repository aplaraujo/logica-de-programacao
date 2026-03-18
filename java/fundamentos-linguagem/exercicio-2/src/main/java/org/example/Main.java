package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ladoQuadrado;

        System.out.print("Digite o lado do quadrado: ");
        ladoQuadrado = sc.nextInt();

        int areaQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.println("A área do quadrado é: " + areaQuadrado);

        sc.close();
    }
}