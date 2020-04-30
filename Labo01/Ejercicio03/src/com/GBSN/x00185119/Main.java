package com.GBSN.x00185119;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String h = "";
        Scanner num = new Scanner(System.in);
        System.out.println("Digite Numero: ");
        h = num.nextLine();

        int a = Integer.parseInt(h);


        String result = recursiveDesc(1, a) + ", " + recursiveAsc(a - 1);
        System.out.println("Resultado: " + result);
    }


    private static String recursiveAsc(int value) {
        return value == 1 ? "" + value : (value + ", " + recursiveAsc(value - 1));
    }

    private static String recursiveDesc(int value, int index) {
        return value == index ? ("" + value) : value + ", " + recursiveDesc(value + 1, index);
    }
}