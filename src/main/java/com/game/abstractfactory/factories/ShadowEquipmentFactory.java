package com.game.abstractfactory.factories;

import com.game.abstractfactory.products.Armor;
import com.game.abstractfactory.products.SpecialAbility;
import com.game.abstractfactory.products.Weapon;
import com.game.abstractfactory.products.shadow.ShadowAbility;
import com.game.abstractfactory.products.shadow.ShadowArmor;
import com.game.abstractfactory.products.shadow.ShadowWeapon;

public class ShadowEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new ShadowWeapon();
    }

    @Override
    public Armor createArmor() {
        return new ShadowArmor();
    }

    @Override
    public SpecialAbility createSpecialAbility() {
        return new ShadowAbility();
    }
}