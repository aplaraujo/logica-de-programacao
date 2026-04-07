package org.example;

public class Main {
    public static void main(String[] args) {
        double ladoQuadrado = 5.0;
        double baseRetangulo = 10.0;
        double alturaRetangulo = 5.0;
        double raioCirculo = 10.0;
        double pi = 3.14;
        FormaGeometrica areaQuadrado = () -> Math.pow(ladoQuadrado, 2);
        FormaGeometrica areaRetangulo = () -> baseRetangulo * alturaRetangulo;
        FormaGeometrica areaCirculo = () -> pi * Math.pow(raioCirculo, 2);

        System.out.println("Área do quadrado: " + areaQuadrado.calcularArea());
        System.out.println("Área do retângulo: " + areaRetangulo.calcularArea());
        System.out.println("Área do círculo: " + areaCirculo.calcularArea());
    }
}