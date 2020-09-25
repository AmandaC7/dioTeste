package dioTeste.teste1;

import java.util.Scanner;

public class Circulo implements AreaCalculavel {

    private float raio;


    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float getArea() {
        return (float) ((raio*raio)* (3.14));
    }

}






