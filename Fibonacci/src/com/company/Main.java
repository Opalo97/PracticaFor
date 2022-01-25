package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, fib = 1, n2 = 0, n1 = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres?: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(fib);
            fib = n1 + n2;
            n2 = n1;
            n1 = fib;
        }
    }
}
