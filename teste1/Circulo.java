package dioTeste.teste1;

import java.util.Scanner;

public class Circulo implements AreaCalculavel {
    Scanner scan = new Scanner(System.in);
    @Override
    public int Numero() {

        int Numero = scan.nextInt();
        return 0;
    }

    @Override
    public int Numero1() {
        int Numero1 = scan.nextInt();
        return 0;
    }
    int areaDoCirculo(){
        int areaDoQuadrado = Numero() * Numero1();
        return areaDoCirculo();
    }
}




