package com.game.factorymethod.products;

public class IceWeapon implements Weapon {
    private final String name = "Ice Dagger";
    private final int damage = 35;

    @Override
    public String getName() { return name; }

    @Override
    public int getBaseDamage() { return damage; }

    @Override
    public String getElementType() { return "Ice"; }

    @Override
    public void attack() {
        System.out.println("Attacking with " + name + " dealing " + damage + " [Ice] damage with Freeze effect!");
    }
}