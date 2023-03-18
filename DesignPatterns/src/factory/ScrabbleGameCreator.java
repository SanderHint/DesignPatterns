package factory;

import com.company.Game;

public class ScrabbleGameCreator implements GameFactory {

    @Override
    public Game create() {
        return (Game) new BoardGame("Scrabble", "Family Game", 4);
    }
}
