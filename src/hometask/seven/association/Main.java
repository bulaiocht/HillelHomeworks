package hometask.seven.association;

import hometask.seven.association.entities.*;

import java.util.Date;

/**
 * Created by horsey on 25.01.16.
 */
public class Main {
    public static void main(String[] args) {

        Human john = new Human ("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnTheDriver = new Driver(john, new DriverLicense(DriverLicense.Category.A,new Date(),new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "10500", DriverLicense.Category.A, 560, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car, johnTheDriver, "Troeshina", "Klovska");
        Truck truck = new Truck();

        //System.out.println(route.toString());

        Trailer trailer = new Trailer("TR1000", 1798, 560, 800, DriverLicense.Category.A, car);
        //System.out.println(trailer.toString());
        trailer.attachToDraggingVehicle(truck);
    }
}