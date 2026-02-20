package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        String[] A = new String[10];

        for(i = 0; i < 10; i++) {
            System.out.print("Digite um nome: ");
            A[i] = sc.nextLine();
        }

        System.out.println("Lista de nomes: ");
        for(i = 0; i < 10; i++) {
            System.out.println(A[i]);
        }

        sc.close();
    }
}