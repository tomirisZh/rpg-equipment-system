package com.game.abstractfactory.products.shadow;

import com.game.abstractfactory.products.SpecialAbility;

public class ShadowAbility implements SpecialAbility {
    @Override public String getName() { return "Soul Drain"; }
    @Override public int getManaCost() { return 30; }
    @Override public String getElementType() { return "Shadow"; }
    @Override public void cast() { System.out.println("Casting Soul Drain [Shadow - 30 Mana]"); }
}