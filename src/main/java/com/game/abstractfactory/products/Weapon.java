package com.game.abstractfactory.products;

public interface Weapon {
    String getName();
    int getDamage();
    String getElementType();
    void attack();
}