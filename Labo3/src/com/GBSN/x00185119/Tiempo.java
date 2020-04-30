package com.GBSN.x00185119;
import java.util.Date;
import javax.swing.*;


public class Tiempo {

    private Date entrada;
    private float salida;


    public Tiempo(Date entrada){

        this.entrada = entrada;
    }



    public float getSalida(Date salida){
        long e = entrada.getTime();
        long s = salida.getTime();

        if(entrada.after(salida)){
            JOptionPane.showMessageDialog(null, "Favor ingresar hora correcta");

        }

        return s-e;

    }

    public Date getEntrada() {
        return entrada;
    }


}
