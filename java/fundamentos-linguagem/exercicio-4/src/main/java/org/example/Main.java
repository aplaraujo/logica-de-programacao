package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2, diferencaIdade;

        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = sc.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        idade1 = sc.nextInt();

        sc.nextLine();
        System.out.print("Digite o nome da segunda pessoa: ");
        nome2 = sc.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        idade2 = sc.nextInt();

        diferencaIdade = idade1 - idade2;

        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferencaIdade + " anos.");

        sc.close();
    }
}