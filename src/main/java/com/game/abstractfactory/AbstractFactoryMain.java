package com.game.abstractfactory;

import com.game.abstractfactory.factories.EquipmentFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        String selectedElement = args.length > 0 ? args[0] : "fire";

        System.out.println("Loading game profile for element: " + selectedElement);
        EquipmentFactory factory = EquipmentProvider.getFactory(selectedElement);
        HeroEquipmentService hero = new HeroEquipmentService(factory);

        hero.displayEquipmentSet();
        hero.executeComboAttack();
        int totalPower = hero.calculateTotalPowerRating();
        System.out.println("Total Effective Power Rating: " + totalPower);
    }
}