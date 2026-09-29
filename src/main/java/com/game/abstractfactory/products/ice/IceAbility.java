package com.game.abstractfactory.products.ice;

import com.game.abstractfactory.products.SpecialAbility;

public class IceAbility implements SpecialAbility {
    @Override public String getName() { return "Blizzard"; }
    @Override public int getManaCost() { return 40; }
    @Override public String getElementType() { return "Ice"; }
    @Override public void cast() { System.out.println("Casting Blizzard [Ice - 40 Mana]"); }
}