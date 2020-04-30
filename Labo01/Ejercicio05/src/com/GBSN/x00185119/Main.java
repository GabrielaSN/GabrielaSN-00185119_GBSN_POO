package com.GBSN.x00185119;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner letra = new Scanner(System.in);
        String cadenaC = "";

        System.out.println("Digite una palabra: ");
        cadenaC = letra.nextLine();

        System.out.println("Sin modificar: " +cadenaC);

        String cadenaNueva = cadenaC.replaceAll("[b,c,d,f,g,h,j,k,l,m,n,ñ,p,q,r,s,t,v,w,x,y,z,B,C,D,F,G,H,J,K,L,M,N,Ñ,P,Q,R,S,T,V,W,X,Y,Z ]", "");

        ArrayList<String> listadeVocales = new ArrayList<>();

        listadeVocales.add(cadenaNueva);
        System.out.println("Sin consonantes: "+listadeVocales);
    }
}