package com.ironhack.wawgame.gameObjects;

public class Weapon {

    private String name;
    private Rarity rarity;
    private Character.CharacterType whoCanEquip;
    private double statsMultiplayer;

    public enum Rarity {
        LEGENDARY, EPIC, RARE, COMMON
    }

    public Weapon(String name, Rarity rarity, Character.CharacterType whoCanEquip) {
        this.name = name;
        setRarity(rarity);
        setWhoCanEquip(whoCanEquip);
        setStatsMultiplayer(rarity);
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public Character.CharacterType getWhoCanEquip() {
        return whoCanEquip;
    }

    public void setWhoCanEquip(Character.CharacterType whoCanEquip) {
        this.whoCanEquip = whoCanEquip;
    }

    public double getStatsMultiplayer() {
        return statsMultiplayer;
    }

    public void setStatsMultiplayer(Rarity rarity) {
        switch (rarity) {
            case LEGENDARY -> this.statsMultiplayer = 2.5;
            case EPIC -> this.statsMultiplayer = 1.8;
            case RARE -> this.statsMultiplayer = 1.3;
            case COMMON -> this.statsMultiplayer = 1.1;
        }
    }

    @Override
    public String toString() {
        return "Weapon {Name=%s, Rarity=%s, CharacterType=%s}".formatted( this.name, this.rarity, this.whoCanEquip);
    }
}
