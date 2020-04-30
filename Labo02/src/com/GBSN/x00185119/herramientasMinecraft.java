package com.GBSN.x00185119;
public class herramientasMinecraft {

    private int clase;
    private int material;
    private int poder;
    private int potencia;
    private int v;

    public herramientasMinecraft(int clase, int material, int poder, int potencia, int rapidez) {

        this.clase = clase;
        this.material = material;
        this.poder = poder;
        this.potencia = potencia;
        this.v = rapidez;
    }


    public int getMaterial() {
        return material;
    }

    public int getClase() {
        return clase;
    }

    public void Build() {

        System.out.println("Premio por construcción!! + 10puntos para todas tus herramientas!");

        poder += 10;

    }

    public void Kill() {

        System.out.println("Mataste un Creeper!! +10 puntos en tu herramienta ");

        potencia += 10;
    }

    public String toString() {
        return "Datos de Herramienta: " + "[Tipo=" + clase + ", Material= " + material + ", Poder= " + poder + ", Potencia= " + potencia + ", Rapidez= " + v + "]";

    }
}
