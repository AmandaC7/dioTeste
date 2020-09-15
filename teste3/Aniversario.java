package dioTeste.teste3;
import java.util.Scanner;

public class Aniversario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        int mes = scan.nextInt();
        int ano = scan.nextInt();

        if (mes > 12) {
            System.out.println("Coloque um mês válido");
        }
        else if(dia>31){
            System.out.println("Coloque um dia válido");
        }
        else if(ano>2018){
            System.out.println("Coloque um ano válido");
        }
        else{
            System.out.println("Data válida");
        }
    }
}