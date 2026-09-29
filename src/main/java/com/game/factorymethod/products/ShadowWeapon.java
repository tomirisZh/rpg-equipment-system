package com.game.factorymethod.products;

public class ShadowWeapon implements Weapon {
    private final String name = "Shadow Scythe";
    private final int damage = 60;

    @Override
    public String getName() { return name; }

    @Override
    public int getBaseDamage() { return damage; }

    @Override
    public String getElementType() { return "Shadow"; }

    @Override
    public void attack() {
        System.out.println("Attacking with " + name + " dealing " + damage + " [Shadow] damage with Lifesteal effect!");
    }
}