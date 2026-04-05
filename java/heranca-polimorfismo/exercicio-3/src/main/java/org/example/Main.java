package org.example;

public class Main {
    public static void main(String[] args) {
        Relogio relogioBR = new RelogioBR();
        relogioBR.setSegundo(0);
        relogioBR.setMinuto(0);
        relogioBR.setHora(25);

        Relogio relogioEUA = new RelogioEUA();

        System.out.println(relogioBR.obterHora());

        System.out.println(relogioEUA.converter(relogioBR).obterHora());
    }
}