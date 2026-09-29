package com.game.factorymethod.products;

public interface Weapon {
    String getName();
    int getBaseDamage();
    String getElementType();
    void attack();
}