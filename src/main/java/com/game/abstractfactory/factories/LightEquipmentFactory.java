package com.game.abstractfactory.factories;

import com.game.abstractfactory.products.Armor;
import com.game.abstractfactory.products.SpecialAbility;
import com.game.abstractfactory.products.Weapon;
import com.game.abstractfactory.products.light.LightAbility;
import com.game.abstractfactory.products.light.LightArmor;
import com.game.abstractfactory.products.light.LightWeapon;

public class LightEquipmentFactory implements EquipmentFactory {
    @Override public Weapon createWeapon() { return new LightWeapon(); }
    @Override public Armor createArmor() { return new LightArmor(); }
    @Override public SpecialAbility createSpecialAbility() { return new LightAbility(); }
}