package com.GBSN.x00185119;

abstract class PowerItem extends Item {


    protected String level;
    protected String type;
    protected int reuseTime;




    public PowerItem(String name, int weight, String description, int rTime, String Level, String tipo){
        super(name, weight, description);
        this.level = Level;
        this.type = tipo;
        this.reuseTime = rTime;

    }

    public abstract void drk();


}
