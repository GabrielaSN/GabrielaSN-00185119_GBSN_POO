package com.GBSN.x00185119;

public class Potion extends PowerItem{
    private int s;

    public Potion(String name, int weight, String description, int reuseTime, String Level, String tipo, int amount){
        super(name, weight, description, reuseTime, Level, tipo);
        this.s= amount;

    }

    @Override
    public void drk() {
        s -=1;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "amount=" + s +
                ", reuseTime=" + reuseTime +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", tipo='" + type + '\'' +
                '}';
    }
}