public class Game {

    static public Party generateRandomParty() {
        return new Party();
    }

    static public Party generatePartyFromCsv() {
        return new Party();
    }

    static public Party generatePartyFromUserInput() {
        return new Party();
    }

    public void initialize() {
        Battle battle = new Battle(generatePartyFromCsv(), generatePartyFromCsv());
        while (!Battle.isFinished()) {
            battle.nextRound();
        }
    }
}
