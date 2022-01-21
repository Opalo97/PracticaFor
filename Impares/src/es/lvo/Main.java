package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Hasta qué número quieres la lista de impares? ");
        numero = entrada.nextInt();
        System.out.println("Los números impares entre 0 y 9 son:");

        for (int i = 1; i < numero; i = i + 2){
            System.out.println(i);
        }


    }
}
