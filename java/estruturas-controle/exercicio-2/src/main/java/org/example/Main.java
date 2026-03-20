package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Digite o peso: ");
        peso = sc.nextDouble();

        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else {
            if (imc > 18.5 && imc < 25) {
                System.out.println("Peso ideal");
            } else {
                if (imc >= 25 && imc < 30) {
                    System.out.println("Levemente acima do peso");
                } else {
                    if (imc >= 30 && imc < 35) {
                        System.out.println("Obesidade grau I");
                    } else {
                        if (imc >= 35 && imc < 40) {
                            System.out.println("Obesidade severa");
                        } else {
                            System.out.println("Obesidade mórbida");
                        }
                    }
                }
            }
        }

        sc.close();
    }
}