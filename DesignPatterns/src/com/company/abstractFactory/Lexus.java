package com.company.abstractFactory;

public abstract class Lexus extends AbstractCar {
    @Override
    public String getModel() {
        return "Comfort";
    }

    @Override
    public String getProducer() {
        return "Lexus";
    }
}
