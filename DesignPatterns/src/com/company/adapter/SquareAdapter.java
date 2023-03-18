package com.company.adapter;

public class SquareAdapter implements Rectangle{

    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;

    }
    @Override
    public int getWidth() {
        return square.getSide();
    }

    @Override
    public int getHeight() {
        return square.getSide();
    }
}
