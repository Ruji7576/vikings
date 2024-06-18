package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    public String msg;
    public Saxon(int health, int strength) {
        super(health, strength);
    }
    public int attack() {
        return this.strength;
    }
    public String getMsg() {
        return msg;
    }
    public int receiveDamage(int damage) {
        int remainingHealth = super.receiveDamage(damage);
        if (remainingHealth > 0) {
            this.msg ="A Saxon has received" + damage + "points of damage";
        } else {
            this.msg = "A Saxon has died in combat";
        }
        return remainingHealth;
    }

}