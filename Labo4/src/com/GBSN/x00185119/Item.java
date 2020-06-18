package com.GBSN.x00185119;

abstract class Item {
    protected int weight;
    protected String description;
    protected int id;
    protected String name;


    public Item(){

    }
    public Item(String nom, int weight, String description){
        this.name=nom;
        this.weight= weight;
        this.description= description;
        this.id = ID.newId();

    }


    public int getId() {
        return id;
    }
}
