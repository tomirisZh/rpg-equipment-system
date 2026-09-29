package com.game.abstractfactory.products.light;

import com.game.abstractfactory.products.SpecialAbility;

public class LightAbility implements SpecialAbility {
    @Override public String getName() { return "Divine Sanctuary"; }
    @Override public int getManaCost() { return 35; }
    @Override public String getElementType() { return "Light"; }
    @Override public void cast() { System.out.println("Casting Divine Sanctuary [Light - 35 Mana] restoring team health!"); }
}