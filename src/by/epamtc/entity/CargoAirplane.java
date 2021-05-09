package by.epamtc.entity;

import java.util.Objects;

public class CargoAirplane extends Plane {
    public String chiefDesigner;

    public CargoAirplane(){}

    public CargoAirplane(String modelTitle, int maxSpeed, double fuelConsumption,
                         int rangeOfFlight, Engine engine, int carryingCapacity, int humanCapacity, String chiefDesigner){
        super(modelTitle, maxSpeed, fuelConsumption, rangeOfFlight, engine, carryingCapacity, humanCapacity);
        this.chiefDesigner = chiefDesigner;
    }

    @Override
    public void fly() {
        System.out.println("Im cargo plane and im flying");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CargoAirplane that = (CargoAirplane) o;

        return Objects.equals(chiefDesigner, that.chiefDesigner);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (chiefDesigner != null ? chiefDesigner.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CargoAirplane{" +
                "modelTitle='" + modelTitle + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                ", rangeOfFlight=" + rangeOfFlight +
                ", engine=" + engine +
                ", carryingCapacity=" + carryingCapacity +
                ", humanCapacity=" + humanCapacity +
                ", chiefDesigner='" + chiefDesigner +
                '}';
    }
}
