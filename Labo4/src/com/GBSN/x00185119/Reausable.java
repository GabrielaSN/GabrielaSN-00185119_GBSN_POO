package com.GBSN.x00185119;

abstract class Reusable extends Item {
    protected int rUses;

    public Reusable(String name, int weight, String description, int rgUses){
        super(name, weight, description);
        this.rUses = rgUses;

    }

}
