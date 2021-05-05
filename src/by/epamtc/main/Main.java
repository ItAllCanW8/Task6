package by.epamtc.main;

import by.epamtc.dao.PlaneDAO;
import by.epamtc.entity.CargoAirplane;
import by.epamtc.entity.Engine;
import by.epamtc.entity.Plane;

public class Main {

    public static void main(String[] args) {
        PlaneDAO planeDAO = new PlaneDAO();

        Engine cargoEngine = new Engine("Cargo Engine", 140580);
        CargoAirplane an225 = new CargoAirplane("An-225", 850, 0.6,4000,
                cargoEngine,250,6,"P.V.Balabuev");

        Engine passangerEngine = new Engine("Passenger Engine", 140580);
        CargoAirplane an225 = new CargoAirplane("An-225", 850, 0.6,4000,
                cargoEngine,250,6,"P.V.Balabuev");

        planeDAO.add(an225);
        System.out.println(((CargoAirplane)planeDAO.get(0)).getCarryingCapacity());
    }
}
