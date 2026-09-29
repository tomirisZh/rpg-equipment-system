package com.game.abstractfactory.products.ice;

import com.game.abstractfactory.products.Weapon;

public class IceWeapon implements Weapon {
    @Override public String getName() { return "Ice Dagger"; }
    @Override public int getDamage() { return 35; }
    @Override public String getElementType() { return "Ice"; }
    @Override public void attack() { System.out.println("Attacking with Ice Dagger [Ice - 35 DMG]"); }
}