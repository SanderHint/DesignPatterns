package com.company.exercise;

public class VideoGameAdapter implements VideoGameInterface {

    private VideoGame videoGame;

    public VideoGameAdapter(VideoGame videoGame) {
        this.videoGame = videoGame;

    }

    @Override
    public String getName() {
        return "PC";
    }

    @Override
    public int getMinNumberOfPlayers() {
        return 1;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return 5;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return true;

    }
}


