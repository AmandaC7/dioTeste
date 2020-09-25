package dioTeste.teste4;

import java.util.Scanner;

public class Elefante {
    public static void main(String[] args) {
        int elefanteIncomoda;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        elefanteIncomoda = scan.nextInt();
        System.out.print("1 elefante incomoda muita gente, " + elefanteIncomoda + " elefantes ");
        for (int i = 1; i <= elefanteIncomoda ; i++) {
                System.out.print("incomoda ");

        }
        System.out.print("muito mais");

        }
    }
