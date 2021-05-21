package by.epamtc.entity;

import java.util.Objects;

public class Plane implements Flying {
    protected String modelTitle;
    protected int maxSpeed;
    protected double fuelConsumption;
    protected int rangeOfFlight;
    protected Engine engine;
    protected int carryingCapacity;
    protected int humanCapacity;

    protected Plane(){}

    protected Plane(String modelTitle, int maxSpeed, double fuelConsumption,
                 int rangeOfFlight, Engine engine, int carryingCapacity, int humanCapacity){
        this.modelTitle = modelTitle;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.rangeOfFlight = rangeOfFlight;
        this.engine = engine;
        this.carryingCapacity = carryingCapacity;
        this.humanCapacity = humanCapacity;
    }

    @Override
    public String getModelTitle() {
        return modelTitle;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public int getHumanCapacity() {
        return humanCapacity;
    }

    public void setModelTitle(String modelTitle) {
        this.modelTitle = modelTitle;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void setHumanCapacity(int humanCapacity) {
        this.humanCapacity = humanCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (maxSpeed != plane.maxSpeed) return false;
        if (Double.compare(plane.fuelConsumption, fuelConsumption) != 0) return false;
        if (rangeOfFlight != plane.rangeOfFlight) return false;
        if (carryingCapacity != plane.carryingCapacity) return false;
        if (humanCapacity != plane.humanCapacity) return false;
        if (!Objects.equals(modelTitle, plane.modelTitle)) return false;
        return Objects.equals(engine, plane.engine);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = modelTitle != null ? modelTitle.hashCode() : 0;
        result = 31 * result + maxSpeed;
        temp = Double.doubleToLongBits(fuelConsumption);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + rangeOfFlight;
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + carryingCapacity;
        result = 31 * result + humanCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "modelTitle='" + modelTitle + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                ", rangeOfFlight=" + rangeOfFlight +
                ", engine=" + engine +
                ", carryingCapacity=" + carryingCapacity +
                ", humanCapacity=" + humanCapacity +
                '}';
    }
}
