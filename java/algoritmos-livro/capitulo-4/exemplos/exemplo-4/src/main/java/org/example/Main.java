package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioAtual, novoSalario;

        salarioAtual = sc.nextDouble();

        if (salarioAtual < 500) {
            novoSalario = salarioAtual + (salarioAtual * 0.15);
        } else {
            if (salarioAtual >= 500 && salarioAtual <= 1000) {
                novoSalario = salarioAtual + (salarioAtual * 0.10);
            } else {
                novoSalario = salarioAtual + (salarioAtual * 0.05);
            }
        }

        System.out.println("Novo salário: " + novoSalario);


        sc.close();
    }
}