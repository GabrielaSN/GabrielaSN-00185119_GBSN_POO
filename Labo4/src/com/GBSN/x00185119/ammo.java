package com.GBSN.x00185119;

public class ammo extends Reusable {
    private boolean eq;

    public ammo(String name, int weight, String dptn, int remainingUses) {
        super(name, weight, dptn, remainingUses);
    }

    public void equip(){
        setEquipped(true);
    }

    private void setEquipped(boolean e) {
        this.eq = e;
    }

    @Override
    public String toString() {
        return "Ammo{" +
                "equipped=" + eq +
                ", remainingUses=" + rUses +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}

