package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int num = sc.nextInt();

        boolean verify = true;

        while (verify) {
            System.out.print("Digite um número para verificação: ");
            int toVerify = sc.nextInt();

            if (toVerify < num) {
                System.out.println("Informe um número maior que " + num);
                continue;
            }

            int result = toVerify % num;
            verify = result == 0;

            System.out.println(toVerify + " % " + num + " = " + result);
        }

        sc.close();
    }
}