package com.company.abstractFactory;

public abstract class AbstractCar implements Car {
    @Override
    public String toString() {
        return "Car: " + getProducer() + " " + getModel() + " " + getType()
                + " has " + getNumberOfCylinders() + " cylinders and engine" + getEngineVolume()
                + " and a trunk with size " + getTrunkSize() + " litres";
    }

}
