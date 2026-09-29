package com.game.abstractfactory.products.fire;

import com.game.abstractfactory.products.Armor;

public class FireArmor implements Armor {
    @Override public String getName() { return "Pyromancer Armor"; }
    @Override public int getDefense() { return 30; }
    @Override public String getElementType() { return "Fire"; }
    @Override public void defend() { System.out.println("Defending with Pyromancer Armor [Fire - 30 DEF]"); }
}