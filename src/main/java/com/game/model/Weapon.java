package com.game.model;
public class Weapon {
    private String name;
    private int damage;
    private String elementType;

    public Weapon(String name, int damage, String elementType) {
        this.name = name;
        this.damage = damage;
        this.elementType = elementType;
    }

    public String getName() { return name; }
    public int getDamage() { return damage; }
    public String getElementType() { return elementType; }

    public void attack() {
        System.out.println("Attacking with " + name + " dealing " + damage + " [" + elementType + "] damage!");
    }
}