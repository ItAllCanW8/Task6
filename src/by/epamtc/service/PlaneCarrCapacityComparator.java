package by.epamtc.service;

import by.epamtc.entity.Plane;

import java.util.Comparator;

public class PlaneCarrCapacityComparator implements Comparator<Plane> {
    @Override
    public int compare(Plane p1, Plane p2) {
        return Integer.compare(p1.getCarryingCapacity(), p2.getCarryingCapacity());
    }
}
