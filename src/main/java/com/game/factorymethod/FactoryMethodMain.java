package com.game.factorymethod;

import com.game.factorymethod.creators.FireWeaponFactory;
import com.game.factorymethod.creators.IceWeaponFactory;
import com.game.factorymethod.creators.WeaponFactory;
import com.game.factorymethod.products.Weapon;

public class FactoryMethodMain {
    public static void main(String[] args) {
        // Мы работаем с абстракцией WeaponFactory
        WeaponFactory fireFactory = new FireWeaponFactory();
        Weapon fireWeapon = fireFactory.prepareWeaponForBattle();
        fireWeapon.attack();

        System.out.println("-----------------------------------");

        WeaponFactory iceFactory = new IceWeaponFactory();
        Weapon iceWeapon = iceFactory.prepareWeaponForBattle();
        iceWeapon.attack();
    }
}