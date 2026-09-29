package com.game.naive;

import com.game.model.Armor;
import com.game.model.SpecialAbility;
import com.game.model.Weapon;

public class NaiveEquipmentManager {
    public Weapon createWeapon(String element) {
        if (element.equalsIgnoreCase("Fire")) {
            return new Weapon("Flame Sword", 50, "Fire");
        } else if (element.equalsIgnoreCase("Ice")) {
            return new Weapon("Ice Dagger", 35, "Ice");
        } else if (element.equalsIgnoreCase("Shadow")) {
            return new Weapon("Shadow Scythe", 60, "Shadow");
        } else {
            throw new IllegalArgumentException("Unknown element: " + element);
        }
    }

    public Armor createArmor(String element) {
        if (element.equalsIgnoreCase("Fire")) {
            return new Armor("Pyromancer Armor", 30, "Fire");
        } else if (element.equalsIgnoreCase("Ice")) {
            return new Armor("Cryo Armor", 45, "Ice");
        } else if (element.equalsIgnoreCase("Shadow")) {
            return new Armor("Necro Robe", 20, "Shadow");
        } else {
            throw new IllegalArgumentException("Unknown element: " + element);
        }
    }

    public SpecialAbility createAbility(String element) {
        if (element.equalsIgnoreCase("Fire")) {
            return new SpecialAbility("Fireball", 25, "Fire");
        } else if (element.equalsIgnoreCase("Ice")) {
            return new SpecialAbility("Blizzard", 40, "Ice");
        } else if (element.equalsIgnoreCase("Shadow")) {
            return new SpecialAbility("Soul Drain", 30, "Shadow");
        } else {
            throw new IllegalArgumentException("Unknown element: " + element);
        }
    }
}