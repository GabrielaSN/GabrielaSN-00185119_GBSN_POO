//Gabriela Beatriz Solorzano Nuila
package com.GBSN.x00185119;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        ArrayList<herramientasMinecraft> tools = new ArrayList<>();

        System.out.println("Herramietas de Minecraft");
        System.out.println("      ");

        boolean opc = true;

        do{
            switch(menu()){

                case 1:
                    System.out.println("\nNueva herramienta...");
                    int clase = clase();
                    int material = materialHer();
                    int poder = poderHer(clase);
                    int potencia = potenciaHer(clase);
                    int v = rapidezHer(clase);

                    tools.add(new herramientasMinecraft(clase, material , poder , potencia , v));

                    break;

                case 2:
                    System.out.println("\nCatálogo");
                    System.out.println("Opciones: \n1)Hoz\n2)Pala\n3)Pico\n4)Hacha\n5)Espada");
                    System.out.println("Opciones: \n1)Madera\n2)Roca\n3)Acero\n4)Plata\n5)Oro");
                    tools.forEach(s-> System.out.println(s.toString()));
                    break;

                case 3:
                    System.out.println("\nSus Herramientas");
                    int aux= claseEncontrado();
                    System.out.println("Su inventario: ");
                    int cont=0, a=0;
                    for(int i=0; i< tools.size(); i++){
                        a = tools.get(i).getMaterial();
                        if(a == aux) {
                            System.out.println(tools.get(i).toString());
                            cont++;
                        }
                    }
                    System.out.println("");
                    System.out.println("Tiene "+ cont+ " herramientas de ese tipo.");
                    break;

                case 4:
                    System.out.println("\nConstruccion...");
                    tools.forEach(herramientasMinecraft::Build);
                    System.out.println("+10 de poder en tus herramientas)");
                    break;

                case 5:
                    System.out.println("\nFuncion Matar");
                    tools.forEach(herramientasMinecraft::Kill);
                    System.out.println("+10 de potencia a cada una de tu catalogo");
                    break;

                case 6:
                    opc = false;
                    break;
                default:
                    System.out.println("Error");
            }

        }while(opc);


    }


    public static int menu() {
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        System.out.println("\n");
        System.out.println("MENU PRINCIPAL:");
        System.out.println("1- Agregar una herrienta nueva");
        System.out.println("2- Mostrar catalogo");
        System.out.println("3- Verificar tipo (Pala, Hacha, Hoz, Espada, Pico)");
        System.out.println("4- Aumentar 10 de poder");
        System.out.println("5- Aumentar 10 de potencia para matar");
        System.out.println("6- Finalizar");
        System.out.print("Opcion: ");
        opc = scan.nextInt();
        scan.nextLine();
        return opc;
    }

    public static int clase() {
        Scanner scan = new Scanner(System.in);
        int type = 0;

        System.out.println("Clase de herramienta: \n1)Hoz\n2)Pala\n3)Pico\n4)Hacha\n5)Espada");
        System.out.print("clase: ");
        type = scan.nextInt();
        scan.nextLine();

        return type;

    }



    public static int materialHer() {
        Scanner scan = new Scanner(System.in);
        int material = 0;

        System.out.println("De que material es la herramienta? \n1) Madera\n2)Roca\n3)Acero \nPlata\n5)Oro");
        System.out.print("Material de herramienta: ");
        material = scan.nextInt();
        scan.nextLine();
        return material;

    }

    public static int claseEncontrado() {
        Scanner scan = new Scanner(System.in);
        int tipo = 0;
        System.out.println("Ingrese el tipo de herramienta: \n1)Hoz\n2)Pala\n3)Pico\n4)Hacha\n5)Espada");
        System.out.print("Tipo: ");
        tipo = scan.nextInt();
        scan.nextLine();

        return tipo;
    }

    public static int rapidezHer(int tipo) {
        int r = 0;
        switch (tipo) {
            case 1:
                r = 10;
                break;
            case 2:
                r = 20;
                break;
            case 3:
                r = 30;
                break;
            case 4:
                r = 40;
                break;
            case 5:
                r = 50;
                break;
        }
        return r;
    }







    public static int poderHer(int tipo) {
        int poder = 0;
        switch (tipo) {
            case 1:
                poder = 50;
                break;
            case 2:
                poder = 40;
                break;
            case 3:
                poder = 30;
                break;
            case 4:
                poder = 20;
                break;
            case 5:
                poder = 10;
                break;
        }
        return poder;
    }

    public static int potenciaHer(int tipo) {
        int potencia = 0;
        switch (tipo) {
            case 1:
                potencia = 10;
                break;
            case 2:
                potencia = 20;
                break;
            case 3:
                potencia = 30;
                break;
            case 4:
                potencia = 40;
                break;
            case 5:
                potencia = 50;
                break;
        }
        return potencia;
    }

}
