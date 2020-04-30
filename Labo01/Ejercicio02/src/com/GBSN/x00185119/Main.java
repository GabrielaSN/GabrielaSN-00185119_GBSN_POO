package com.GBSN.x00185119;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Ingrese palabra: ");
        Scanner word = new Scanner(System.in);
        String frase="";
        frase= word.nextLine();

        int ini =0;
        int fin = frase.length()-1;
        boolean Error = false;

        while((ini<fin) && (!Error)){

            if(frase.charAt(ini)==frase.charAt(fin)){

                ini++;
                fin --;
            }
            else{
                Error = true;
            }
            if(!Error)
                System.out.println(frase + " Es Palindrome");

            else {
                System.out.println(frase + " No es Palindrome");
            }

        }
    }
}
