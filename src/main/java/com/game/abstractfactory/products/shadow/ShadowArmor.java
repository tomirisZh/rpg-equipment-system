package com.game.abstractfactory.products.shadow;

import com.game.abstractfactory.products.Armor;

public class ShadowArmor implements Armor {
    @Override public String getName() { return "Necro Robe"; }
    @Override public int getDefense() { return 20; }
    @Override public String getElementType() { return "Shadow"; }
    @Override public void defend() { System.out.println("Defending with Necro Robe [Shadow - 20 DEF]"); }
}