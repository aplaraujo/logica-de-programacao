package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int anoNascimento;

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = sc.nextInt();

        int anoAtual = LocalDate.now().getYear();

        int idade = anoAtual - anoNascimento;

        System.out.println("Olá " + nome + "! Você tem " + idade + " anos.");

        sc.close();
    }
}