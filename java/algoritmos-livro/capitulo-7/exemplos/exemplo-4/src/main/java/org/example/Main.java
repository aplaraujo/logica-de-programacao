package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, N;

        System.out.print("Digite um número inteiro: ");
        N = sc.nextInt();

        String[] nome = new String[N];

        for(i = 0; i < N; i++){
            System.out.print("Digite um nome: ");
            nome[i] = sc.next();
        }

        System.out.println("===========================");
        System.out.println("===== Vetor de nomes ======");

        for(i = 0; i < N; i++){
            System.out.println(nome[i]);
        }


        sc.close();
    }
}