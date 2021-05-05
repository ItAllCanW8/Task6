package by.epamtc.entity;

public interface IPLane {
    void fly();

    String getModelTitle();

    int getMaxSpeed();

    double getFuelConsumption();

    int getRangeOfFlight();

    Engine getEngine();

    int getCarryingCapacity();

    int getHumanCapacity();
}