package by.epamtc.service;

import by.epamtc.dao.PlaneDAO;
import by.epamtc.entity.Plane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Airline {
    private ArrayList<Plane> planes;

    public Airline(){
        planes = new ArrayList<>();
    }

    public Airline(PlaneDAO dao){
        planes = dao.getAll();
    }

    public void update(PlaneDAO dao){
        planes = dao.getAll();
    }

    public int calcHumanCapacity(){
        int result = 0;

        for (Plane p: planes)
            result += p.getHumanCapacity();

        return result;
    }

    public int calcCarryingCapacity(){
        int result = 0;

        for (Plane p: planes)
            result += p.getCarryingCapacity();

        return result;
    }

    public void sort(Comparator<Plane> comparator)
    {
        planes.sort(comparator);
    }

    public Plane findSuitableFuelConsPlane(double from, double to)
    {
        for (Plane p: planes)
            if(p.getFuelConsumption() >= from && p.getFuelConsumption() <= to)
                return p;

        return null;
    }

    public ArrayList<Plane> getAll() {
        return planes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airline airline = (Airline) o;

        return Objects.equals(planes, airline.planes);
    }

    @Override
    public int hashCode() {
        return planes != null ? planes.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "planes=" + planes +
                '}';
    }
}
