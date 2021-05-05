package by.epamtc.dao;

import by.epamtc.entity.Plane;

import java.util.ArrayList;

public class PlaneDAO {
    private ArrayList<Plane> planes;

    public PlaneDAO() {
        planes = new ArrayList<>();
    }

    public Plane get(int id){
        return planes.get(id);
    }

    public ArrayList<Plane> getAll() {
        return planes;
    }

    public void add(Plane plane) {
        planes.add(plane);
    }

    public void delete(int index){
        planes.remove(index);
    }
}
