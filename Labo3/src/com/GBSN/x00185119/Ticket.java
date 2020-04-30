package com.GBSN.x00185119;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.text.ParseException;


public class Ticket {


    private Tiempo tmp;
    private Auto auto;

    public Ticket(String placa){
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
        Date entrada = null;
        boolean enter = false;

        do {
            String ingreso = JOptionPane.showInputDialog(" tiempo de entrada: ");
            try {
                entrada = hora.parse(ingreso);
                enter = true;
            } catch (ParseException e) {
                System.out.println("Hay Mal Formato");
                JOptionPane.showMessageDialog(null, "\nIntentarlo otra vez.");
            }

        }while(!enter);

        System.out.println("hora de ingreso: ");
        System.out.print(entrada);

        this.tmp = new Tiempo(entrada);
        this.auto = new Auto(placa);
    }

    public void showStatus(){
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
        Date entrada = tmp.getEntrada();
        JOptionPane.showMessageDialog(null, "Hora Ingreso: "+ hora.format(entrada) + "\n placa: "+ auto.getPlacadeAuto());
    }

    public double getPago(){
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
        Date Exit = null;
        float unTotal=0;
        double total =0;
        boolean H = false;

        do{
            String s = JOptionPane.showInputDialog(null, "hora de salida: ");
            try{
                Exit = hora.parse(s);
                H = true;

            }catch (ParseException e){
                System.out.println("\nhay mal formato");
                JOptionPane.showMessageDialog(null, "Itentar otra vez por mal formato");

            }
            if(H) {
                do {
                    unTotal = tmp.getSalida(Exit);
                    if(unTotal == -1){
                        s = JOptionPane.showInputDialog(null, "hora actual: ");
                        try{
                            Exit = hora.parse(s);
                            H = true;

                        }catch (ParseException e) {
                            System.out.println("\nmal formato");
                            JOptionPane.showMessageDialog(null, "Reintentar por favor.");
                        }
                    }
                }while (unTotal == -1);
            }

        } while(!H);

        total = unTotal;
        total = total * 0.0000002778;

        return total;

    }

    public String getPlaca(){
        return auto.getPlacadeAuto();
    }




}
