package factory;

import com.company.Game;

public class HaloGameCreator implements GameFactory {
    @Override
    public Game create() {
        return new PCGame("Halo", "FPS", 1, 4, true);
    }
}
