package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, gender;
        name = sc.nextLine();
        gender = sc.nextLine();

        System.out.println(name + " - " + gender);
    }
}