package com.company;

public interface Game {
    String getName();
    String getType();
    int getMinNumberOfPlayers();
    int getMaxNumberOfPlayers();
    boolean canBePlayedRemotely();

    String getPegiName();

    int getAgeRating();

    int coresNeeded();

    boolean pingTime();
}
