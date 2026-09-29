package com.game.factorymethod.creators;

import com.game.factorymethod.products.Weapon;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon();
    public Weapon prepareWeaponForBattle() {
        Weapon weapon = createWeapon();
        System.out.println("[Weapon Inspection] Inspecting " + weapon.getName() + "...");
        System.out.println("[Weapon Sharpening] Polishing edge for maximum " + weapon.getElementType() + " efficiency.");
        return weapon;
    }
}