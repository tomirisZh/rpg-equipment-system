package com.game.abstractfactory;

import com.game.abstractfactory.factories.*;
import com.game.abstractfactory.products.*;
import com.game.abstractfactory.products.fire.*;
import com.game.abstractfactory.products.ice.*;
import com.game.abstractfactory.products.shadow.*;
import com.game.abstractfactory.products.light.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquipmentSystemTest {
    @Test
    void testFireFactoryCreation() {
        EquipmentFactory factory = new FireEquipmentFactory();
        assertEquals("Fire", factory.createWeapon().getElementType());
        assertEquals("Fire", factory.createArmor().getElementType());
        assertEquals("Fire", factory.createSpecialAbility().getElementType());
    }
    @Test
    void testIceFactoryCreation() {
        EquipmentFactory factory = new IceEquipmentFactory();
        assertEquals("Ice", factory.createWeapon().getElementType());
        assertEquals("Ice", factory.createArmor().getElementType());
        assertEquals("Ice", factory.createSpecialAbility().getElementType());
    }
    @Test
    void testShadowFactoryCreation() {
        EquipmentFactory factory = new ShadowEquipmentFactory();
        assertEquals("Shadow", factory.createWeapon().getElementType());
        assertEquals("Shadow", factory.createArmor().getElementType());
        assertEquals("Shadow", factory.createSpecialAbility().getElementType());
    }
    @Test
    void testLightFactoryCreation() { // Тест для 4-го семейства (Part G)
        EquipmentFactory factory = new LightEquipmentFactory();
        assertEquals("Light", factory.createWeapon().getElementType());
        assertEquals("Light", factory.createArmor().getElementType());
        assertEquals("Light", factory.createSpecialAbility().getElementType());
    }
    @Test
    void testFireWeaponStats() {
        Weapon weapon = new FireEquipmentFactory().createWeapon();
        assertEquals("Flame Sword", weapon.getName());
        assertEquals(50, weapon.getDamage());
    }
    @Test
    void testIceArmorStats() {
        Armor armor = new IceEquipmentFactory().createArmor();
        assertEquals("Cryo Armor", armor.getName());
        assertEquals(45, armor.getDefense());
    }
    @Test
    void testShadowAbilityStats() {
        SpecialAbility ability = new ShadowEquipmentFactory().createSpecialAbility();
        assertEquals("Soul Drain", ability.getName());
        assertEquals(30, ability.getManaCost());
    }
    @Test
    void testLightWeaponStats() {
        Weapon weapon = new LightEquipmentFactory().createWeapon();
        assertEquals("Holy Spear", weapon.getName());
        assertEquals(55, weapon.getDamage());
    }
    @Test
    void testProductCompatibilitySuccess() {
        EquipmentFactory factory = new FireEquipmentFactory();
        Weapon w = factory.createWeapon();
        Armor a = factory.createArmor();
        assertEquals(w.getElementType(), a.getElementType());
    }

    @Test
    void testSetBonusPowerCalculation() {
        HeroEquipmentService service = new HeroEquipmentService(new FireEquipmentFactory());
        // Base damage 50 + Base defense 30 = 80. Bonus 20% = 96
        assertEquals(96, service.calculateTotalPowerRating());
    }
    @Test
    void testRuntimeSelectionFire() {
        assertTrue(EquipmentProvider.getFactory("fire") instanceof FireEquipmentFactory);
    }

    @Test
    void testRuntimeSelectionCaseInsensitive() {
        assertTrue(EquipmentProvider.getFactory("LIGHT") instanceof LightEquipmentFactory);
    }

    @Test
    void testRuntimeSelectionTrimmed() {
        assertTrue(EquipmentProvider.getFactory("  ice  ") instanceof IceEquipmentFactory);
    }
    @Test
    void testUnknownElementThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> EquipmentProvider.getFactory("Poison"));
    }
    @Test
    void testNullElementThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> EquipmentProvider.getFactory(null));
    }
}