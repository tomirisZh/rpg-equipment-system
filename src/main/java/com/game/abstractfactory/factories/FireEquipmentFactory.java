package com.game.abstractfactory.factories;

import com.game.abstractfactory.products.Armor;
import com.game.abstractfactory.products.SpecialAbility;
import com.game.abstractfactory.products.Weapon;
import com.game.abstractfactory.products.fire.FireAbility;
import com.game.abstractfactory.products.fire.FireArmor;
import com.game.abstractfactory.products.fire.FireWeapon;

public class FireEquipmentFactory implements EquipmentFactory {
    @Override public Weapon createWeapon() { return new FireWeapon(); }
    @Override public Armor createArmor() { return new FireArmor(); }
    @Override public SpecialAbility createSpecialAbility() { return new FireAbility(); }
}