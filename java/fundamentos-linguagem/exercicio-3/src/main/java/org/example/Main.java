package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baseRetangulo, alturaRetangulo;

        System.out.print("Digite a base do retângulo: ");
        baseRetangulo = sc.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        alturaRetangulo = sc.nextInt();

        int areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.println("A área do retângulo é: " + areaRetangulo);

        sc.close();
    }
}