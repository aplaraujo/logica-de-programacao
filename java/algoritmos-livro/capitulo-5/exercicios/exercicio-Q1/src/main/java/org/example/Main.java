package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double areaTot, largura, comp, areaComodo;
        char resp;
        String comodo;

        areaTot = 0;
        resp = 's';

        while(resp == 'S' || resp == 's') {
            System.out.print("Digite o nome do cômodo: ");
            sc.nextLine();
            comodo = sc.nextLine();

            System.out.print("Digite a largura do cômodo: ");
            largura = sc.nextDouble();

            System.out.print("Digite o comprimento do cômodo: ");
            comp = sc.nextDouble();

            areaComodo = largura * comp;

            System.out.println("Área do cômodo: " + areaComodo);

            areaTot += areaComodo;

            System.out.print("Deseja continuar?: ");
            resp = sc.next().charAt(0);
        }

        System.out.println("Área total: " + areaTot);

        sc.close();
    }
}