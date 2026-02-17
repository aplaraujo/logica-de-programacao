package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        char genero = scanner.next().charAt(0);

        switch (genero) {
            case 'M':
                System.out.println("Ilmo. Sr. " + nome);
                break;
            case 'm':
                System.out.println("Ilmo. Sr. " + nome);
                break;
            case 'F':
                System.out.println("Ilma. Sra. " + nome);
                break;
            case 'f':
                System.out.println("Ilma. Sra. " + nome);
                break;
            default:
                System.out.println("Informação inválida");
        }

        scanner.close();
    }
}