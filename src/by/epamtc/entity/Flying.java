package by.epamtc.entity;

public interface Flying {
    String getModelTitle();

    int getMaxSpeed();

    double getFuelConsumption();

    int getRangeOfFlight();

    Engine getEngine();

    int getCarryingCapacity();

    int getHumanCapacity();
}