package com.GBSN.x00185119;

public class Elix extends PowerItem {

    private int amount;
    private int Time;

    public Elix(String nom, int weight, String description, int rTime, String Level, String type, int amount, int time){
        super(nom, weight, description, rTime, Level, type);

    }


    @Override
    public String toString() {
        return "Elixir{" +
                "amount=" + amount +
                ", Time=" + Time +
                ", reuseTime=" + reuseTime +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
    @Override
    public void drk() {
        for(int i =0; i< Time; i++){

        }

    }
}


