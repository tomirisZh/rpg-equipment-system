package com.game.abstractfactory.factories;

import com.game.abstractfactory.products.Armor;
import com.game.abstractfactory.products.SpecialAbility;
import com.game.abstractfactory.products.Weapon;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
    SpecialAbility createSpecialAbility();
}