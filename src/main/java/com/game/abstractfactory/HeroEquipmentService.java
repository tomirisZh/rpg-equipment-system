package com.game.abstractfactory;

import com.game.abstractfactory.factories.EquipmentFactory;
import com.game.abstractfactory.products.Armor;
import com.game.abstractfactory.products.SpecialAbility;
import com.game.abstractfactory.products.Weapon;

public class HeroEquipmentService {
    private final Weapon weapon;
    private final Armor armor;
    private final SpecialAbility ability;

    public HeroEquipmentService(EquipmentFactory factory) {
        this.weapon = factory.createWeapon();
        this.armor = factory.createArmor();
        this.ability = factory.createSpecialAbility();
    }

    public void displayEquipmentSet() {
        System.out.println("=== Full Equipment Set Info ===");
        System.out.println("Weapon: " + weapon.getName() + " (Damage: " + weapon.getDamage() + ")");
        System.out.println("Armor: " + armor.getName() + " (Defense: " + armor.getDefense() + ")");
        System.out.println("Ability: " + ability.getName() + " (Mana: " + ability.getManaCost() + ")");
    }

    public void executeComboAttack() {
        System.out.println("\n--- Executing Battle Combo ---");
        armor.defend();
        weapon.attack();
        ability.cast();
    }

    public int calculateTotalPowerRating() {
        int basePower = weapon.getDamage() + armor.getDefense();
        boolean isFullSet = weapon.getElementType().equals(armor.getElementType())
                && armor.getElementType().equals(ability.getElementType());

        if (isFullSet) {
            System.out.println("\n[SET BONUS ACTIVATED] Full " + weapon.getElementType() + " set synergized! +20% power bonus.");
            return (int) (basePower * 1.2);
        }
        return basePower;
    }

    public Weapon getWeapon() { return weapon; }
    public Armor getArmor() { return armor; }
    public SpecialAbility getAbility() { return ability; }
}