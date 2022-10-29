//Nuevo test GitHub pablo --> Develop

package com.ironhack.wawgame.gameObjects;

public interface Attacker {
    // weakAttack
    // heavyAttack


    // COMENTAR SABADO ENTRE VOSOTROS talvez solo necesitamos un método attack e implementar la lógica de heavy y weak dentro del método
    // por ejemplo, método attack del wizzard con seudo codigo:
    // public int attack() { devuelve un entero con el daño
    //     si el mana es mayor o igual que 5:
    //        devolver inteligencia del wizzard
    //     si no devolver 2
    // }

    public void doAttack();
        //Restar stamina o mana

    public void receiveAttack ();
        //restar vida


}
