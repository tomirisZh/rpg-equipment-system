package com.game.abstractfactory.products.ice;

import com.game.abstractfactory.products.Armor;

public class IceArmor implements Armor {
    @Override public String getName() { return "Cryo Armor"; }
    @Override public int getDefense() { return 45; }
    @Override public String getElementType() { return "Ice"; }
    @Override public void defend() { System.out.println("Defending with Cryo Armor [Ice - 45 DEF]"); }
}