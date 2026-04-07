package org.example;

public class Main {
    public static void main(String[] args) {
        Imposto alimentacao = (valor) -> valor * 0.01;
        Imposto saude = (valor) -> valor * 0.015;
        Imposto vestuario = (valor) -> valor * 0.025;
        Imposto cultura = (valor) -> valor * 0.04;

        System.out.println("Calculando valor do tributo de alimentos: " + alimentacao.calcularTributo(5.00));
        System.out.println("Calculando valor do tributo de medicamentos: " + saude.calcularTributo(10.00));
        System.out.println("Calculando valor do tributo de uma camiseta: " + vestuario.calcularTributo(50.00));
        System.out.println("Calculando valor do tributo de um ingresso de teatro: " + cultura.calcularTributo(80.00));
    }
}