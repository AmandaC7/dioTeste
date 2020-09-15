package dioTeste.teste4;

import java.util.Scanner;

public class Elefante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        int i = 0;
        for (i = scan.nextInt(); i > 0; i --) {
            if (i == 1){
                System.out.println("1 Elefante incomoda muita gente");
            }
            else if (i > 1){
                System.out.println(i + " Elefantes incomodam muito mais");

            }
        }



        }
    }
