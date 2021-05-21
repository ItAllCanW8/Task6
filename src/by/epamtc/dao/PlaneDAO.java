package by.epamtc.dao;

import by.epamtc.entity.CargoAirplane;
import by.epamtc.entity.Engine;
import by.epamtc.entity.PassengerPlane;
import by.epamtc.entity.Plane;
import by.epamtc.exception.NoSuchPlaneException;
import by.epamtc.exception.NonExistingParameterException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PlaneDAO {
    private ArrayList<Plane> planes;

    public PlaneDAO() {
        planes = new ArrayList<>();
    }

    public void createPlanesFromData(String dataFileName) throws IOException, NonExistingParameterException {
        Path path = Paths.get("src\\by\\epamtc\\resources\\" + dataFileName).toAbsolutePath();
        ArrayList<String> readedLines = (ArrayList<String>) Files.readAllLines(path);

        for (String line : readedLines) {
            String[] planeComponents = line.split(" ");

            planes.add(createPlane(planeComponents));
        }
    }

    private Plane createPlane(String[] planeComponents) throws NonExistingParameterException {
        if(planeComponents == null)
            throw new NonExistingParameterException("cant create a plane from null plane components");

        for(String component : planeComponents) {
                if (component == null)
                    throw new NonExistingParameterException("cant create a plane from null plane component");
        }

        Plane plane;

        if (planeComponents[0].equals("Cargo")) {
            plane = new CargoAirplane(planeComponents[1], Integer.parseInt(planeComponents[2]),
                    Double.parseDouble(planeComponents[3]), Integer.parseInt(planeComponents[4]),
                    new Engine(planeComponents[8], Integer.parseInt(planeComponents[9])),
                    Integer.parseInt(planeComponents[5]),Integer.parseInt(planeComponents[6]), planeComponents[7]);
        } else {
            plane = new PassengerPlane(planeComponents[1], Integer.parseInt(planeComponents[2]),
                    Double.parseDouble(planeComponents[3]), Integer.parseInt(planeComponents[4]),
                    new Engine(planeComponents[8], Integer.parseInt(planeComponents[9])),
                    Integer.parseInt(planeComponents[5]),Integer.parseInt(planeComponents[6]), planeComponents[7]);
        }

        return plane;
    }

    public Plane get(int id) throws NoSuchPlaneException {
        if(id < 0 || id >= planes.size())
            throw new IndexOutOfBoundsException("cant get plane with index out of bounds");

        if(!planes.contains(planes.get(id)))
            throw new NoSuchPlaneException("cant get non existing plane");

        return planes.get(id);
    }

    public ArrayList<Plane> getAll() {
        return planes;
    }

    public void add(Plane plane) throws NonExistingParameterException {
        if(plane == null)
            throw new NonExistingParameterException("cant add null plane");

        planes.add(plane);
    }

    public void delete(int index) throws NoSuchPlaneException {
        if(index < 0 || index >= planes.size())
            throw new IndexOutOfBoundsException("cant delete plane with index out of bounds");

        if(!planes.contains(planes.get(index)))
            throw new NoSuchPlaneException("cant delete non existing plane");

        planes.remove(index);
    }
}
