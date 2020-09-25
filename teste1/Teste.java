package dioTeste.teste1;

import dioTeste.teste1.Circulo;

public class Teste {
    public static void main(String[] args) {
        Circulo newCirculo = new Circulo(5);
        System.out.println("A área do circulo é de: " +newCirculo.getArea());

        Quadrado newQuadrado = new Quadrado(5);
        System.out.println("A área do quadrado é de: " +newQuadrado.getArea());

        Retangulo newRetangulo = new Retangulo(12,10);
        System.out.print("A área do retângulo é de: " + newRetangulo.getArea());

    }
}