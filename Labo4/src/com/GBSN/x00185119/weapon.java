package com.GBSN.x00185119;

public class weapon extends Reusable {
    private String tipo;
    private double speed;
    private double danio ;
    private String wield;
    private int nivel;

    public weapon(String name, int weight, String description, int rUses, String type, double speed, double dmg, String Type, int lvl) {
        super(name, weight, description, rUses);
        this.tipo=type;
        this.speed=speed;
        this.wield=Type;
        this.nivel=lvl;
        this.danio=dmg;

    }

    public void upper(){

    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type='" + tipo + '\'' +
                ", speed=" + speed +
                ", damage=" + danio +
                ", wieldType='" + wield + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", level=" + nivel +
                ", remainingUses=" + rUses +
                ", description='" + description + '\'' +
                '}';
    }
}



