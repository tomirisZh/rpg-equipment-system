package com.game.abstractfactory.products.fire;

import com.game.abstractfactory.products.SpecialAbility;

public class FireAbility implements SpecialAbility {
    @Override public String getName() { return "Fireball"; }
    @Override public int getManaCost() { return 25; }
    @Override public String getElementType() { return "Fire"; }
    @Override public void cast() { System.out.println("Casting Fireball [Fire - 25 Mana]"); }
}