package factory;

import com.company.Game;

public class PCGame implements Game {
    private String name;
    private String type;
    private int minNumberOfPlayers;
    private int maxNumberOfPlayers;
    private boolean isOnline;

    private String pegiName;
    private int ageRating;
    private int coresNeeded;
    private int pingTime;

    public PCGame(String name, String type, int minNumberOfPlayers, int maxNumberOfPlayers, boolean isOnline) {
        this.name = name;
        this.type = type;
        this.minNumberOfPlayers = minNumberOfPlayers;
        this.maxNumberOfPlayers = maxNumberOfPlayers;
        this.isOnline = isOnline;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMinNumberOfPlayers() {
        return minNumberOfPlayers;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return false;
    }

    public boolean canBePlayedRemotlely() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "PCGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", minNumberOfPlayers=" + minNumberOfPlayers +
                ", maxNumberOfPlayers=" + maxNumberOfPlayers +
                ", isOnline=" + isOnline +
                '}';
    }

    @Override
    public String getPegiName() {
        return null;
    }

    @Override
    public int getAgeRating() {
        return 0;
    }

    @Override
    public int coresNeeded() {
        return 0;
    }

    @Override
    public boolean pingTime() {
        return true;
    }
}

