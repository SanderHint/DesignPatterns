package com.company.abstractFactory;

public abstract class Toyota extends AbstractCar {
    @Override
    public String getModel() {
        return "Camry";
    }

    @Override
    public String getProducer() {
        return "Toyota";
    }
}
