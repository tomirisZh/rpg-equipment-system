package com.game.factorymethod.creators;

import com.game.factorymethod.products.FireWeapon;
import com.game.factorymethod.products.Weapon;

public class FireWeaponFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new FireWeapon();
    }
}