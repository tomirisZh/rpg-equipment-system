package com.game.naive;

import com.game.model.Armor;
import com.game.model.SpecialAbility;
import com.game.model.Weapon;

public class NaiveMain {
    public static void main(String[] args) {
        NaiveEquipmentManager manager = new NaiveEquipmentManager();
        String weaponElement = "Fire";
        String armorElement = "Ice";
        String abilityElement = "Fire";

        Weapon weapon = manager.createWeapon(weaponElement);
        Armor armor = manager.createArmor(armorElement);
        SpecialAbility ability = manager.createAbility(abilityElement);

        System.out.println("--- Equip Character ---");
        weapon.attack();
        armor.defend();
        ability.cast();
    }
}