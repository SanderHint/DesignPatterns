package singleton.exercises;

/**
 *  Create an eager singleton class called Engine
 *  It should have a boolean field called engine;
 *
 *  Create a lazy double-checked singleton called Computer
 *  It should have a boolean field called startUp
 */
public class Engine {
    private static Engine Instance = new Engine();
private boolean isEngineWorking = false;
    private Engine() {}

    public void turnEngineOn() {
        isEngineWorking = true;
    }

    public boolean getEngineState() {
        return isEngineWorking;
    }

    public static Engine getInstance() {
        return Instance;
    }
}
