package by.epamtc.service;

import by.epamtc.entity.Plane;

import java.util.Comparator;

public class PlaneCapacityComparator implements Comparator<Plane> {
    @Override
    public int compare(Plane p1, Plane p2) {
        int result = new PlaneCarrCapacityComparator().compare(p1, p2);

        if (result == 0)
            result = Integer.compare(p1.getHumanCapacity(), p2.getHumanCapacity());

        return result;
    }
}
