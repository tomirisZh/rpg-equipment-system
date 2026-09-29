package com.game.factorymethod.creators;

import com.game.factorymethod.products.IceWeapon;
import com.game.factorymethod.products.Weapon;

public class IceWeaponFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new IceWeapon();
    }
}