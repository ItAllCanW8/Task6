package by.epamtc.service;

import by.epamtc.dao.PlaneDAO;
import by.epamtc.entity.Plane;

import java.util.ArrayList;
import java.util.Comparator;

public class Airline {
    private ArrayList<Plane> planes;

    public Airline(){
        planes = new ArrayList<>();
    }

    public Airline(PlaneDAO dao){
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
}
