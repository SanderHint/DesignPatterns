package factory;

import com.company.Game;

public class BoardGame implements GameFactory{
    private String name;
    private String type;
    private int maxPlayerNumber;

    public BoardGame(String name, String type, int maxPlayerNumber) {
        this.name = name;
        this.type = type;
        this.maxPlayerNumber = maxPlayerNumber;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxPlayerNumber() {
        return maxPlayerNumber;
    }

    public void setMaxPlayerNumber(int maxPlayerNumber) {
        this.maxPlayerNumber = maxPlayerNumber;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", maxPlayerNumber=" + maxPlayerNumber +
                '}';
    }

    @Override
    public Game create() {
        return null;
    }
}

