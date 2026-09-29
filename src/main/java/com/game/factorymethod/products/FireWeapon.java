package com.game.factorymethod.products;

public class FireWeapon implements Weapon {
    private final String name = "Flame Sword";
    private final int damage = 50;

    @Override
    public String getName() { return name; }

    @Override
    public int getBaseDamage() { return damage; }

    @Override
    public String getElementType() { return "Fire"; }

    @Override
    public void attack() {
        System.out.println("Attacking with " + name + " dealing " + damage + " [Fire] damage with Burn effect!");
    }
}