package com.GBSN.x00185119;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static int caso1(){
        int w =0;
        boolean on = true;
        do {
            w = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de tipo del objeto\n1- Posion" +
                    "\n2- Elixir\n3- Ammo\n4- Arma"));

            switch (w){
                case 1:
                    JOptionPane.showMessageDialog(null, "Posion agregada");
                    on = false;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Elixir agregado");
                    on = false;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ammo agregado");
                    on = false;
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Arma agregada");
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR DE VALIDACION");
            }
        }while(on);


        return w;
    }


    public static void main(String[] args) {
        ArrayList<Item> P = new ArrayList<>();
        ArrayList<Item> Comu = new ArrayList<>();

        boolean on = true;

        do{
            int type=0, reuseTime=20;
            String name = "a";

            switch (printMenu()){
                case 1:
                    type = caso1();
                    name = case2(type);

                    if(type==1) {
                        P.add(new Potion(name, case1W(type), caso3(type), reuseTime, nivel(name), Ltype(name),
                                getA(name)));
                        JOptionPane.showMessageDialog(null, "Se ha añadido una posion a tu inventario");
                    }
                    if(type == 2){
                        P.add(new Elix(name, case1W(type), caso3(type), reuseTime, nivel(name), Ltype(name),
                                getA(name), getE()));
                        JOptionPane.showMessageDialog(null, "Se ha añadido un elixir a tu inventario");
                    }

                    if(type == 3){
                        P.add(new ammo(name, case1W(type), caso3(type), getR()));
                        JOptionPane.showMessageDialog(null, "Se ha añadido un ammo a tu inventario");
                    }
                    if (type == 4){
                        P.add(new weapon(name, case1W(type), caso3(type), getR(), getArma(), gRapid(),
                                gDaño(), getWtype(), NivelArma()));
                        JOptionPane.showMessageDialog(null, "Se ha añadido nueva arma a tu inventario");
                    }

                    break;

                case 2:
                    boolean exists= false;
                    do{
                        int id =Integer.parseInt(JOptionPane.showInputDialog("ID del objeto:  "));

                        for (int i = 0; i < P.size(); i++) {
                            int aux = P.get(i).getId();
                            if ( aux == id) {
                                exists = true;
                                Comu.add(P.get(i));
                            }
                        }
                        if(!exists) {JOptionPane.showMessageDialog(null, "Este ID no existe");}

                    }while(!exists);
                    break;

                case 3:
                    int lista = getL();
                    int srch = Integer.parseInt(JOptionPane.showInputDialog("ID del objeto:  "));
                    if(lista==1){
                        P.forEach(obj-> {
                            if(obj instanceof Potion && obj.getId() == srch ){
                                JOptionPane.showMessageDialog(null, ((Potion)obj).toString());
                            }
                            if(obj instanceof Elix && obj.getId() == srch ){
                                JOptionPane.showMessageDialog(null, ((Elix)obj).toString());
                            }
                            if(obj instanceof ammo && obj.getId() == srch ){
                                JOptionPane.showMessageDialog(null, ((ammo)obj).toString());
                            }
                            if(obj instanceof weapon && obj.getId() == srch ){
                                JOptionPane.showMessageDialog(null, ((weapon)obj).toString());
                            }
                        });
                    }
                    if(lista==2){
                        Comu.forEach(obj-> {
                            if(obj instanceof Potion && obj.getId() == srch ){
                                JOptionPane.showMessageDialog(null, ((Potion)obj).toString());
                            }
                            if(obj instanceof Elix && obj.getId() == srch ){
                                JOptionPane.showMessageDialog(null, ((Elix)obj).toString());
                            }
                            if(obj instanceof ammo && obj.getId() == srch ){
                                JOptionPane.showMessageDialog(null, ((ammo)obj).toString());
                            }
                            if(obj instanceof weapon && obj.getId() == srch ){
                                JOptionPane.showMessageDialog(null, ((weapon)obj).toString());
                            }
                        });
                    }
                    break;
                case 4:
                    int lista2 = getL();
                    int tipoSrch= getTyper();
                    if(lista2==1){
                        if(tipoSrch==1) {
                            P.forEach(obj -> {
                                if (obj instanceof Potion) { JOptionPane.showMessageDialog(null,
                                        ((Potion) obj).toString()); }
                            });
                        }
                        if(tipoSrch==2) {
                            P.forEach(obj -> {
                                if (obj instanceof Elix) { JOptionPane.showMessageDialog(null,
                                        ((Elix) obj).toString()); }
                            });
                        }
                        if(tipoSrch==3) {
                            P.forEach(obj -> {
                                if (obj instanceof ammo) { JOptionPane.showMessageDialog(null,
                                        ((ammo) obj).toString()); }
                            });
                        }
                        if(tipoSrch==4) {
                            P.forEach(obj -> {
                                if (obj instanceof weapon) { JOptionPane.showMessageDialog(null,
                                        ((weapon) obj).toString()); }
                            });
                        }
                    }
                    if(lista2==2){
                        if(tipoSrch==1) {
                            Comu.forEach(obj -> {
                                if (obj instanceof Potion) { JOptionPane.showMessageDialog(null,
                                        ((Potion) obj).toString()); }
                            });
                        }
                        if(tipoSrch==2) {
                            Comu.forEach(obj -> {
                                if (obj instanceof Elix) { JOptionPane.showMessageDialog(null,
                                        ((Elix) obj).toString()); }
                            });
                        }
                        if(tipoSrch==3) {
                            Comu.forEach(obj -> {
                                if (obj instanceof ammo) { JOptionPane.showMessageDialog(null,
                                        ((ammo) obj).toString()); }
                            });
                        }
                        if(tipoSrch==4) {
                            Comu.forEach(obj -> {
                                if (obj instanceof weapon) { JOptionPane.showMessageDialog(null,
                                        ((weapon) obj).toString()); }
                            });
                        }
                    }
                    break;
                case 5:
                    int lista3 = getL();
                    int rmvId= Integer.parseInt(JOptionPane.showInputDialog("ID del objeto:  "));
                    if(lista3==1){
                        P.removeIf(obj-> (obj.getId()== rmvId));
                    }
                    if(lista3==2){
                        Comu.removeIf(obj-> (obj.getId()== rmvId));
                    }
                    break;
                case 6:
                    int lista4= getL();
                    int remvType = getTyper();
                    if(lista4==1){
                        if(remvType==1) {
                            P.removeIf(obj-> (obj instanceof Potion));
                        }
                        if(remvType==2) {
                            P.removeIf(obj-> (obj instanceof Elix));
                        }
                        if(remvType==3) {
                            P.removeIf(obj-> (obj instanceof ammo));
                        }
                        if(remvType==4) {
                            P.removeIf(obj-> (obj instanceof weapon));
                        }
                    }
                    if(lista4==2){
                        if(remvType==1) {
                            Comu.removeIf(obj-> (obj instanceof Potion));
                        }
                        if(remvType==2) {
                            Comu.removeIf(obj-> (obj instanceof Elix));
                        }
                        if(remvType==3) {
                            Comu.removeIf(obj-> (obj instanceof ammo));
                        }
                        if(remvType==4) {
                            Comu.removeIf(obj-> (obj instanceof weapon));
                        }
                    }
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Regresa pronto!");
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR DE VALIDACION");
            }

        }while(on);


    }
    public static int printMenu(){
        int x=0;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido \n1-Añadir un nuevo objeto" +
                "\n2-Compartir objeto.\n3- Buscar por ID del objeto.\n4- Buscar por TIPO del objeto." +
                "\n5- Eliminar por ID del objeto." +
                "\n6- Eliminar por TIPO del objeto.\n7- Salir"));
        return x;

    }

    public static double gRapid(){
        return Double.parseDouble(JOptionPane.showInputDialog(null, "Rapidez del arma: "));
    }

    public static double gDaño(){
        return Double.parseDouble(JOptionPane.showInputDialog(null, "Nivel de daño del arma:  "));
    }

    public static String getWtype(){
        String aux="a";
        int s =0;
        boolean on = true;
        do {
            s = Integer.parseInt(JOptionPane.showInputDialog(null, "Elegir una opcion \n1- Manual" +
                    "\n2- Automatica"));

            switch (s){
                case 1:
                    aux= "Manual";
                    on = false;
                    break;
                case 2:
                    aux= "Automatica";
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR");
            }
        }while(on);

        return aux;
    }

    public static int NivelArma(){
        int s =0;
        boolean on = true;
        do {
            s = Integer.parseInt(JOptionPane.showInputDialog(null, "Nivel del arma:  "));

            if(s>0 && s<50){
                on = false;
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }while(on);

        return s;
    }


    public static String case2(int w){
        String name = "asd";
        name = JOptionPane.showInputDialog(null, "Nombre del objeto ");

        switch (w){
            case 1:
                name = "Posion";
                break;
            case 2:
                name= "Elixir";
                break;
            case 3:
                name= "Ammo";
                break;
            case 4:
                name= "Arma";
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR");
        }
        return name;
    }

    public static int case1W(int x){
        int w = 0;
        switch (x){
            case 1:
                w = 1;
                break;
            case 2:
                w = 1;
                break;
            case 3:
                w= 2;
                break;
            case 4:
                w= 4;
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR");
        }
        return w;
    }

    public static String caso3(int s){
        String desc = "w";
        switch (s){
            case 1:
                desc = "Sanacion total";
                break;
            case 2:
                desc= "Sanacion parcial";
                break;
            case 3:
                desc= "Municiones";
                break;
            case 4:
                desc=  "Armas";
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR");
        }
        return desc;
    }

    public static String nivel(String name){
        String aux="a";
        int x =0;
        boolean on = true;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una opcion" + name + " " +
                    "\n1- Bajo rango" +
                    "\n2- Normal\n3- superior"));

            switch (x){
                case 1:
                    aux= "Bajo rango";
                    on = false;
                    break;
                case 2:
                    aux= "normal";
                    on = false;
                    break;
                case 3:
                    aux = "superior";
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR");
            }
        }while(on);

        return aux;

    }

    public static String Ltype(String name){
        String aux="a";
        int x =0;
        boolean on = true;

        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una opcion" + name + "" +
                    " \n1- Superior" +
                    "\n2- vida"));

            switch (x){
                case 1:
                    aux= "Superior";
                    on = false;
                    break;
                case 2:
                    aux= "vida";
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR");
            }
        }while(on);

        return aux;

    }

    public static int getA(String name){
        int x=0;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de usos de su "+name +": "));
        return x;

    }

    public static int getE(){
        return  Integer.parseInt(JOptionPane.showInputDialog("Tiempo de uso del elixir: "));
    }

    public static int getR(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de usos de su objeto: "));
    }

    public static String getArma(){
        String aux ="a";
        boolean on = true;
        do {
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Tipo de arma a agregar\n1- espada" +
                    "\n2- rifle\n3- misil\n4- gema\n5-guante"));

            switch (x){
                case 1:
                    aux = "espada";
                    on = false;
                    break;
                case 2:
                    aux="rifle";
                    on = false;
                    break;
                case 3:
                    aux="misil";
                    on = false;
                    break;
                case 4:
                    aux="gema";
                    on = false;
                    break;
                case 5:
                    aux="guante";
                    on= false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR");
            }
        }while(on);


        return aux ;
    }



    public static int getL(){
        int s =0;
        boolean on = true;
        do {
            s = Integer.parseInt(JOptionPane.showInputDialog(null, "Que lista desea ver? " +
                    "\n1- Objetos personales" +
                    "\n2- Objetos comunes"));

            switch (s){
                case 1:
                    on = false;
                    break;
                case 2:
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR");
            }
        }while(on);

        return s;
    }

    public static int getTyper(){
        int s =0;
        boolean on = true;
        do {
            s = Integer.parseInt(JOptionPane.showInputDialog(null, "Objeto que desea buscar\n1- Posion" +
                    "\n2- ELixir\n3- Ammo\n4- Arma"));

            switch (s){
                case 1:
                    on = false;
                    break;
                case 2:
                    on = false;
                    break;
                case 3:
                    on = false;
                    break;
                case 4:
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR");
            }
        }while(on);

        return s;

    }
}
