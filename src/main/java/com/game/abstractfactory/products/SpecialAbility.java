package com.game.abstractfactory.products;

public interface SpecialAbility {
    String getName();
    int getManaCost();
    String getElementType();
    void cast();
}