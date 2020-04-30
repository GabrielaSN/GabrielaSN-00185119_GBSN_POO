package com.GBSN.x00185119;
import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<>();

        boolean on = true;
        do{
            switch (printMenú()){
                case 1:
                    String placa = JOptionPane.showInputDialog("Placa: ");
                    tickets.add(new Ticket(placa));
                    JOptionPane.showMessageDialog(null, "Pase.");
                    break;

                case 2:
                    int a=0;
                    boolean PLACA= false;
                    do{ 
                        String plate = JOptionPane.showInputDialog("Placa: ");
                        for (int i = 0; i < tickets.size(); i++) {
                            if (tickets.get(i).getPlaca().equals(plate)) {
                                a = i;
                                PLACA = true;
                            }
                        }
                        if(!PLACA) {JOptionPane.showMessageDialog(null, "No registrada\n Ingrese otra");}

                    }while(!PLACA);
                    double hrs = tickets.get(a).getPago();
                    double monto = montoPago(hrs);
                    inputPag(monto);

                    tickets.remove(a);
                    break;

                case 3:
                    int var=0;
                    boolean W= false;
                    do{
                        String plaxe = JOptionPane.showInputDialog("Ingrese placa: ");
                        for (int i = 0; i < tickets.size(); i++) {
                            if (tickets.get(i).getPlaca().equals(plaxe)) {
                                var = i;
                                W = true;
                            }
                        }
                        if(!W) {JOptionPane.showMessageDialog(null, "No registrada\n intentar otra vez");}

                    }while(!W);
                    tickets.get(var).showStatus();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Intentar otra vez por favor");
            }


        }while (on);

    }

    public static int printMenú(){
        int y=0;
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido \n   MENU:\n1) Entrar " +
                "\n2) Salir \n3) Consultar Ticket\n4) hasta pronto"));
        return y;
    }

    public static double montoPago(double hrs){
        double monto=0;
        if(hrs <0.5){
            monto = 0.00;
        }
        else if(hrs < 1){
            monto = 0.50;
        }
        else if(hrs < 2){
            monto = 1.00;
        }
        else if(hrs >= 2){
            monto = 5.00;
        }
        return monto;
    }

    public static void inputPag(double monto){
        boolean V = false;

        if(monto == 0 ){
            JOptionPane.showMessageDialog(null, "Estuvo menos de 30 min\nNo hay costo de ticket\nVuelva pronto");
            return;
        }

        do{
            int cent=0;
            int cin =0;
            int diez=0;
            int Cora =0;
            int dollar=0;
            boolean ingresando = true;

            do{

                int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Monto a pagar: $"+ monto +" \nIncerte las monedas:"+
                        "\n1) Centavo\n2) Cinco Ctvs\n3)Diez Ctvs\n4) Una cora\n5) Un Dolar\n6) Fin"));
                switch (x){
                    case 1:
                        cent++;
                        break;
                    case 2:
                        cin++;
                        break;
                    case 3:
                        diez++;
                        break;
                    case 4:
                        Cora++;
                        break;
                    case 5:
                        dollar++;
                        break;
                    case 6:
                        ingresando = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error! intentalo otra vez");
                }

            }while(ingresando);
            Monedas monedas = new Monedas(cent, cin, diez, Cora, dollar);
            double Insertado= monedas.getSumatoria();
            if(Insertado < monto){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente.\n Ingresó: $"+ Insertado);
            }
            else if(Insertado >= monto){
                double Suvuelto = (Insertado - monto);
                JOptionPane.showMessageDialog(null, "Vuelto: $"+ Suvuelto+ ". \nBuen viaje, drive safe");
                V = true;
            }
        }while(!V);

    }
}
