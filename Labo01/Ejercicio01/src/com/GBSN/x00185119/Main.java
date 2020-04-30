package com.GBSN.x00185119;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int number,fib1,fib2;

        do {
            System.out.println("Ingrese cantidad de cifras: ");
            number = num.nextInt();
        }while (number <= 1);

        System.out.println("Los" + number + "primeros terminos de la serie fibonacci son: ");

        fib1=1;
        fib2=1;

        System.out.println(fib1 + " ");
        for(int i=2; i<=number; i++){
            System.out.println(fib2 + " ");
            fib2= fib1 + fib2;
            fib1= fib2 - fib1;
        }
        System.out.println();

    }
}