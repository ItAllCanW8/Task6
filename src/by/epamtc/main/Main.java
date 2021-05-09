package by.epamtc.main;

import by.epamtc.dao.PlaneDAO;
import by.epamtc.entity.Plane;
import by.epamtc.exception.NoSuchPlaneException;
import by.epamtc.exception.NonExistingParameterException;
import by.epamtc.service.Airline;
import by.epamtc.service.PlaneCapacityComparator;
import by.epamtc.service.PlaneCarrCapacityComparator;

import java.io.*;

public class Main {

    public static void printPlanes(Airline airline){
        System.out.println("=========================================================================================");

        for (Plane plane: airline.getAll())
            System.out.println(plane);

        System.out.println("=========================================================================================");
    }

    public static void main(String[] args) throws IOException, NonExistingParameterException {
        String fileName = "data.txt";

        PlaneDAO dao = new PlaneDAO();
        dao.createPlanesFromData(fileName);
        Airline airline = new Airline(dao);

        printPlanes(airline);

        airline.sort(new PlaneCarrCapacityComparator());

        printPlanes(airline);

        airline.sort(new PlaneCapacityComparator());

        printPlanes(airline);

        System.out.println("Suitable plane: " + airline.findSuitableFuelConsPlane(0.0, 0.5));
        System.out.println("General carrying capacity: " + airline.calcCarryingCapacity());
        System.out.println("General human capacity: " + airline.calcHumanCapacity());
    }
}
