package org.example;

public class Main {
    public static void main(String[] args) {
        int grao, quadro, i;

        grao = 0;
        quadro = 1;
        i = 1;

        while(i <= 64) {
            grao = grao + quadro;
            quadro = quadro * 2;
            i++;
        }

        System.out.println(grao);
    }
}