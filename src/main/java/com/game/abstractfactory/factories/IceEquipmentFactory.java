package com.game.abstractfactory.factories;

import com.game.abstractfactory.products.Armor;
import com.game.abstractfactory.products.SpecialAbility;
import com.game.abstractfactory.products.Weapon;
import com.game.abstractfactory.products.ice.IceAbility;
import com.game.abstractfactory.products.ice.IceArmor;
import com.game.abstractfactory.products.ice.IceWeapon;

public class IceEquipmentFactory implements EquipmentFactory {
    @Override public Weapon createWeapon() { return new IceWeapon(); }
    @Override public Armor createArmor() { return new IceArmor(); }
    @Override public SpecialAbility createSpecialAbility() { return new IceAbility(); }
}