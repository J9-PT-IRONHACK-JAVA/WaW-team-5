public class Battle {
    private Party party1;
    private Party party2;

    public Battle(Party party1, Party party2) {
        this.party1 = party1;
        this.party2 = party2;
    }

    public void initialize() {

    }

    public void nextRound() {

        combatiente1 =  party1.chooseCharacter("1"); //comprobar si está vivo, si está devolver el character y borrarlo de la lista de party
        combatiente2 = party2.chooseCharacter("1");  // comprobar si está vivo, si está devolver el character y borrarlo de la lista de party
        Duel duel = new Duel(combatiente1, combatiente2);
        duel.figth(); // while hasta que uno muere

       // if  (duel.isTie) {
       //     envia a los dos al cementerio;
       // } else  {
       //     getwiner y lo envias al equipo
       //     getloser y lo envias al cementerio
       // }
    }
    public boolean isFinished() {
        return  (party1.size() == 0 || party2.size() == 0);
    }
}
