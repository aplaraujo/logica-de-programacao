package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quociente, dividendo, divisor, aux, resto;

        quociente = 0;

        System.out.print("Digite o valor do dividendo: ");
        dividendo = sc.nextInt();

        System.out.print("Digite o valor do divisor: ");
        divisor = sc.nextInt();

        aux = dividendo;

        while(aux >= divisor) {
            aux -= divisor;
            quociente++;
        }

        resto = aux;

        System.out.println("Resto: " + resto + " | " + "Quociente: " + quociente);

        sc.close();
    }
}