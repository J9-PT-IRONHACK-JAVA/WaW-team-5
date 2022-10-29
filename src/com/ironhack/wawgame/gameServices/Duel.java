package com.ironhack.wawgame.gameServices;

import com.ironhack.wawgame.gameObjects.Attacker;
import com.ironhack.wawgame.gameObjects.Character;

public class Duel {

//ATRIBUTES
    private Character combatant1;
    private Character combatant2;
    private boolean isTie = false;


//CONSTRUCTOR

    public Duel(Character combatant1, Character combatant2) {
        this.combatant1 = combatant1;
        this.combatant2 = combatant2;
    }


//METODOS

    /*fight realiza todos los atacantes entre los combatans hasta que uno de los dos muere
    *Como parametros se ponen instancias del interface Attack en lugar de tipo Character
    * para evitar la necesidad de tener que identificar si el Character es Wizard o Warrior
    * ya que Character es Abstract y no puede ser instanciada.
    * @param attacker1
    * @param attacker2
    */
    public void fight (Attacker attacker1, Attacker attacker2) {
             while (attacker1.getIsAlive() && attacker2.getIsAlive()) {
                 attack (attacker1, attacker2);
                  if (combatant1.getHp() <=0 && combatant2.getHp() <=0) {
                      this.isTie = true;
                  }
             }

    }

    //getLooser devuelve en tipo Character del perdedor del duelo
    //@param combatant 1: combatiente 1 de la clase Duel
    //@param combatant 1: combatiente 2 de la clase Duel
    public Character getLooser (Character combatant1, Character combatant2) {
        if (combatant1.getHp() <=0) {
            combatant1.setIsAlive (false);
            return combatant1;
        } else {
            combatant2.setIsAlive (false);
            return combatant2;
        }
    }

    //getWinner devuelve en tipo Character el ganador del duelo
    //@param combatant 1: combatiente 1 de la clase Duel
    //@param combatant 1: combatiente 2 de la clase Duel
    public Character getWinner (Character combatant1, Character combatant2) {
        if (combatant1.getHp() <=0) {
            return combatant2;
        } else {
            return combatant1;
        }
    }

    //attack determina el tipo de ataque que realiza el atacante (attacker) y en función de ello,
    //resta el damage (setDamage) al attacker y resta hp al defender
    //@param attacker: es el Character que realiza el ataque
    //@param defender: es el Character que recibe el ataque
    //@param typeOfAttack: tipo de ataque que realiza attacker: 1=Heavy, 2=Weak
    public void attack (Attacker attacker1, Attacker attacker2) {
        attacker1.doAttack();
        attacker2.receiveAttack();

        attacker2.doAttack();
        attacker1.receiveAttack();
    }

}
