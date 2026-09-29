package com.game.model;

public class Armor {
    private String name;
    private int defense;
    private String elementType;

    public Armor(String name, int defense, String elementType) {
        this.name = name;
        this.defense = defense;
        this.elementType = elementType;
    }

    public String getName() { return name; }
    public int getDefense() { return defense; }
    public String getElementType() { return elementType; }

    public void defend() {
        System.out.println("Defending with " + name + " providing " + defense + " [" + elementType + "] protection!");
    }
}