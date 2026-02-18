package org.example;

public class Main {
    public static void main(String[] args) {
        int i, grao, quadro;
        grao = 0;
        quadro = 1;

        for(i = 1; i <= 64; i++) {
            grao = grao + quadro;
            quadro = quadro * 2;
        }

        System.out.println(grao);
    }
}