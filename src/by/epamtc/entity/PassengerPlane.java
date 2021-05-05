package by.epamtc.entity;

public class PassengerPlane extends Plane {
    public int portholeNumber;

    public PassengerPlane(){}

    public PassengerPlane(String modelTitle, int maxSpeed, double fuelConsumption,
                          int rangeOfFlight, Engine engine, int carryingCapacity, int humanCapacity, int portholeNumber){
        super(modelTitle, maxSpeed, fuelConsumption, rangeOfFlight, engine, carryingCapacity, humanCapacity);
        this.portholeNumber = portholeNumber;
    }

    @Override
    public void fly(){
        System.out.println("Im passenger plane and im flying");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerPlane that = (PassengerPlane) o;

        return portholeNumber == that.portholeNumber;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + portholeNumber;
        return result;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "portholeNumber=" + portholeNumber +
                ", modelTitle='" + modelTitle + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                ", rangeOfFlight=" + rangeOfFlight +
                ", engine=" + engine +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }
}