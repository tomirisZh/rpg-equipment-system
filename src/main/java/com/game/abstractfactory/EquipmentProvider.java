package com.game.abstractfactory;

import com.game.abstractfactory.factories.EquipmentFactory;
import com.game.abstractfactory.factories.FireEquipmentFactory;
import com.game.abstractfactory.factories.IceEquipmentFactory;
import com.game.abstractfactory.factories.ShadowEquipmentFactory;
import com.game.abstractfactory.factories.LightEquipmentFactory;

public class EquipmentProvider {
    public static EquipmentFactory getFactory(String elementType) {
        if (elementType == null) {
            throw new IllegalArgumentException("Element type cannot be null");
        }

        switch (elementType.trim().toLowerCase()) {
            case "light":
                return new LightEquipmentFactory();
            case "fire":
                return new FireEquipmentFactory();
            case "ice":
                return new IceEquipmentFactory();
            case "shadow":
                return new ShadowEquipmentFactory();
            default:
                throw new IllegalArgumentException("Unsupported elemental family: " + elementType);
        }
    }
}