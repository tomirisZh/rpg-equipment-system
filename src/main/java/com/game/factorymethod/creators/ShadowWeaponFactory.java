package com.game.factorymethod.creators;

import com.game.factorymethod.products.ShadowWeapon;
import com.game.factorymethod.products.Weapon;

public class ShadowWeaponFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new ShadowWeapon();
    }
}