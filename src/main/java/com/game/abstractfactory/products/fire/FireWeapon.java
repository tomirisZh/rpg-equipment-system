package com.game.abstractfactory.products.fire;

import com.game.abstractfactory.products.Weapon;

public class FireWeapon implements Weapon {
    @Override public String getName() { return "Flame Sword"; }
    @Override public int getDamage() { return 50; }
    @Override public String getElementType() { return "Fire"; }
    @Override public void attack() { System.out.println("Attacking with Flame Sword [Fire - 50 DMG]"); }
}