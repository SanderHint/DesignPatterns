package singleton.exercises;

// Eager Singleton using class implementation
// This type of singleton is created on startup
public class Counter {
    private static final Counter INSTANCE = new Counter();
    private int count = 0; // Holds the value of what the current count is.

    // This overrides the default public constructor
    // By doing this, classes outside will be unable to
    // just create instances of this class
    private Counter() {}

    // Increase the counter

    public void increment() {
        count++;
    }
    // getter for count
    public int getCount() {
        return count;
    }

    // getter for the singleton
    public static Counter getInstance() {
        return INSTANCE;
    }


}
