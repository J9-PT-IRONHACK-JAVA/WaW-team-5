//Nuevo test GitHub pablo --> Develop

package com.ironhack.wawgame.gameServices;

import com.ironhack.wawgame.gameObjects.Attacker;
import com.ironhack.wawgame.gameObjects.Character;
import com.ironhack.wawgame.gameObjects.Warrior;
import com.ironhack.wawgame.gameObjects.Wizard;

public class Duel {

    private Character combatant1;
    private Character combatant2;

    //pruebas atributos
    private Wizard  wizardCombatant1, wizardCombatant2;
    private Warrior warriorCombatant1, warriorCombatant2;
    boolean isTie = false;
    private final int heavyHpLooseWarrior= -5; //Es lo que resta un Heavy Attack de un Warrior
    private final int heavyHpLooseWizard = -3; //Es lo que resta un Heavy Attack de un Wizard
    private final int weakHpLooseWarrior = -2; //Es lo que resta un Weak Attack de un Warrior
    private final int weakHpLooseWizard  = -1; //Es lo que resta un Weak Attack de un Wizard


    //CONSTRUCTOR
    public Duel(Character combatant1, Character combatant2, boolean isTie) {
       //pruebas
        if (combatant1 instanceof Wizard) { wizardCombatant1 = (Wizard) combatant1; }
        else { warriorCombatant1 = (Warrior) combatant1;}

        if (combatant2 instanceof Wizard) { wizardCombatant2 = (Wizard) combatant2;}
        else { warriorCombatant2 = (Warrior) combatant2; }

        //codigo pablo
        /* if (combatant1 instanceof Wizard) { this.combatant1 = (Wizard) combatant1;}
            else { this.combatant1 = (Warrior) combatant1;
        }
        if (combatant2 instanceof Wizard) { this.combatant2 = (Wizard) combatant2;}
            else { this.combatant2 = (Warrior) combatant2;
        }
        this.isTie = isTie;*/
    }


    //Deifinir de alguna forma si el tipo de combatant que es cada uno WARRIOR O WIZARD

    // metodo fight()
    public void fight (Attacker attacker1, Attacker attacker2) {
             while (combatant1.getIsAlive() && combatant2.getIsAlive()) {
                 attack (combatant1, combatant2);
                 attack (combatant2, combatant1);

                  if (combatant1.getHp() <=0 && combatant2.getHp() <=0) {
                      this.isTie = true;
                      //si uno de los combatientes esta muerto cambiar el estoad de isAlive
                  }
             }

    }



    // Luis: metodo empate mira si los dos combatientes estan muertos
        // Pablo: ¿hace falta? Ya he creado el atributo isTie  que se cambia en el metodo fight cuando hay empate


    //getLooser devuelve en tipo Character del perdedor del duelo
    //@param combatant 1: combatiente 1 de la clase Duel
    //@param combatant 1: combatiente 2 de la clase Duel
    public Character getLooser (Character combatant1, Character combatant2) {
        if (combatant1.getHp() <=0) {
            return combatant1;
        } else {
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

    //setDamage resta el daño al atacante
    //@param attacker, es el combatiente que realiza el ataque
    //@param typeOfAttack, es el tipo de ataque que realizar 1 = Heavy Attack; 2 = Weak Attack
    public void setDamage (Character attacker,int typeOfAttack) {
        if (attacker instanceof Wizard) {
            Wizard wizardAttacker = (Wizard) attacker;
            wizardAttacker.updateMana(Wizard.getManaDamage(typeOfAttack), typeOfAttack);
        }
            else {
               Warrior warriorAttacker = (Warrior) attacker;
               warriorAttacker.updateStamina (Warrior.getStaminaDamage(typeOfAttack), typeOfAttack);
        }
    }

    //setHpLoose resta el hp del Character que recibe el ataque (defender) en función del ataque que se realiza
    //@param attacker: es el Character que realiza el ataque
    //@param defender: es el Character que recibe el ataque
    //@param typeOfAttack: tipo de ataque que recibe el defender. 1 = Heavy Attack; 2 = Weak Attack
    public void setHpLoose (Character attacker, Character defender, int typeOfAttack) {
        switch (typeOfAttack) {
            case 1: //Heavy Attack
                if (attacker instanceof Wizard) { defender.looseHp (heavyHpLooseWizard);}
                else {defender.looseHp (heavyHpLooseWarrior);}
                break;
            case 2: //Weak Attack
                if (attacker instanceof Wizard) { defender.looseHp (weakHpLooseWizard);}
                else {defender.looseHp (weakHpLooseWarrior);}
                break;
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



        //pablo code
        /*
        if (attacker instanceof Wizard) {
            Wizard attackerWizard = (Wizard) attacker;
        }
        else { Warrior attackerWarrior = (Warrior) attacker;}

        if (attackerWizard.canHeavyAttack() || attackerWarrior.canHeavyAttack() ) {
            setDamage(attacker,1);
            setHpLoose(attacker, defender,1);
        }
        else {
            setHpLoose(defender,attacker,2);
        }
    }*/

    //imprimir los atributos despues de cada ataque
    //dar opción de elegir el tipo de ataque despues de cada ataque
}
