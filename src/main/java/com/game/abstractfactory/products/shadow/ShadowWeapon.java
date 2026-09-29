package com.game.abstractfactory.products.shadow;

import com.game.abstractfactory.products.Weapon;

public class ShadowWeapon implements Weapon {
    @Override public String getName() { return "Shadow Scythe"; }
    @Override public int getDamage() { return 60; }
    @Override public String getElementType() { return "Shadow"; }
    @Override public void attack() { System.out.println("Attacking with Shadow Scythe [Shadow - 60 DMG]"); }
}