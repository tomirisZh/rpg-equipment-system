package com.game.model;

public class SpecialAbility {
    private String name;
    private int manaCost;
    private String elementType;

    public SpecialAbility(String name, int manaCost, String elementType) {
        this.name = name;
        this.manaCost = manaCost;
        this.elementType = elementType;
    }

    public String getName() { return name; }
    public int getManaCost() { return manaCost; }
    public String getElementType() { return elementType; }

    public void cast() {
        System.out.println("Casting " + name + " costing " + manaCost + " mana [" + elementType + "]!");
    }
}