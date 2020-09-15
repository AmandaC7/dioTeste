package dioTeste.teste1;

import java.util.Scanner;

public class Circulo implements AreaCalculavel {
    private float pi;
    private int raio;
    Scanner scan = new Scanner(System.in);
    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }


    @Override
    public float getArea() {
        float pi = (float) 3.14;
        float raio = 0;
        float area = pi * (raio * raio);
        return area;
        }

    }






