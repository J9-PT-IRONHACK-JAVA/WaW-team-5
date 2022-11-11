package com.ironhack.wawgame.gameServices;

import com.ironhack.wawgame.gameMenus.BattleMenu;
import com.ironhack.wawgame.gameMenus.ExpeditionMenu;
import com.ironhack.wawgame.gameObjects.*;
import com.ironhack.wawgame.gameObjects.Character;
import net.datafaker.Faker;

import java.util.Scanner;

public class Expedition {
    private boolean isFinished;
    private Party party;
    private String player;
    private int autoincrement = 0;

    private int counter = 0;
    private static final int MAX_EXPEDITIONS=5;

    public Expedition(String player, Party party) {
        this.player = player;
        this.isFinished = false;
        this.party = party;
    }


    public Object nextExpedition() {
        //Defino los combatientes del duelo
        var expeditor = pickCombatant(party);
        var monster = generateRandomMonster();

        var resp = ExpeditionMenu.showMonsterPowerAndAskToScape((Monster) monster);

        if (resp.equals("yes")) {
            Duel duel = new Duel(expeditor, monster);
            Weapon weapon = ((Monster) monster).dropWeapon();
            duel.fight((Attacker) expeditor, (Attacker) monster);
            if (!monster.getIsAlive()) {
                var equip = ExpeditionMenu.printMonsterDieAndDropEquip(weapon);
                if (equip.equals("yes")) {
                    expeditor.equipWeapon(weapon);
                }
            }
            expeditor.setHp(duel.getHpCombatant1());
            expeditor.setIsAlive(true);
        } else {
            ExpeditionMenu.printScape();
        }
        var anotherExpedition = ExpeditionMenu.askForAnotherExpedition();
        if (!anotherExpedition.equals("yes")) {
          this.isFinished = true;
        }

        this.counter++;
        if (this.counter >= this.MAX_EXPEDITIONS) {
            ExpeditionMenu.printNotAllowedExpeditions();
            this.isFinished = true;
        }

        return null;
    }

    public Character pickCombatant(Party party) {
        var charactersOfParty = party.getParty();
        var scanner = new Scanner(System.in);

        BattleMenu.printCharactersAlive(party.getPlayerName(), party.getPartyName(), charactersOfParty);
        int iDCharacter1 = scanner.nextInt();

        while (!party.characterIsInParty(iDCharacter1)) {
            BattleMenu.printWrongIdSelected();
            iDCharacter1 = scanner.nextInt();
        }
        // combatiente1 =  party1.chooseCharacter("1"); //comprobar si está vivo, si está devolver el character
        return party.getCharacterById(iDCharacter1);
    }

    private Character generateRandomMonster() {
        Monster monster = new Monster(autoincrement, new Faker().name().firstName(), Character.CharacterType.MONSTER);
        autoincrement++;
        return monster;
    }

    public void finishExpedition() {
        this.isFinished = true;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
}
