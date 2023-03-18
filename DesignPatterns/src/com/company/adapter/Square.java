package com.company.adapter;

public class Square implements Rectangle{
  private int side;
  public Square(int side) {
      this.side = side;
  }

  public int getSide() {
      return side;
  }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getArea() {
        return Rectangle.super.getArea();
    }
}
