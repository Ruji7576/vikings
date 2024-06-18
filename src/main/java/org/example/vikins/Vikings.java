package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    public String name;
    public String msg;

    public Vikings(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
        this.msg = "msg";
    }
    public int attack() {
        return getStrength();
    }
    public int receiveDamage(int damage) {
        int remainingHealth = super.receiveDamage(damage);
        if (remainingHealth > 0) {
            this.msg = this.name + "has received" + damage + "points of damage";
        } else {
            this.msg = this.name + "has died in combat";
        }
        return remainingHealth;
    }
    public String getMsg() {
        return this.msg;
    }
    public String battleCry() {
        return "Odin Owns You All!";
    }
}