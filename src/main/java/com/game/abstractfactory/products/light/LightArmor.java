package com.game.abstractfactory.products.light;

import com.game.abstractfactory.products.Armor;

public class LightArmor implements Armor {
    @Override public String getName() { return "Paladin Mail"; }
    @Override public int getDefense() { return 50; }
    @Override public String getElementType() { return "Light"; }
    @Override public void defend() { System.out.println("Defending with Paladin Mail [Light - 50 DEF] with Sacred Shield!"); }
}