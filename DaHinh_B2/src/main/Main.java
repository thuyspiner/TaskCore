package main;

import model.Car;
import model.Train;
import model.Vehicle;

public class Main {

    public static void printVehicleTicket(Vehicle vehicle) {
        vehicle.printTicket();
    }

    public static void main(String[] args) {
        Train train = new Train(50.0, 100, 10);
        Car car = new Car(30.0, 5, "Taxi");

        printVehicleTicket(train);
        printVehicleTicket(car);
    }
}

