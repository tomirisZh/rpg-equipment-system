package com.game.abstractfactory.products.light;

import com.game.abstractfactory.products.Weapon;

public class LightWeapon implements Weapon {
    @Override public String getName() { return "Holy Spear"; }
    @Override public int getDamage() { return 55; }
    @Override public String getElementType() { return "Light"; }
    @Override public void attack() { System.out.println("Attacking with Holy Spear [Light - 55 DMG] with Smite effect!"); }
}