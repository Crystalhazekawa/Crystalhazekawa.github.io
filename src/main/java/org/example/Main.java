package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RentalAgency rentalAgency = new RentalAgency();

        Vehicle car1 = new Car("C001", "Toyota Camry", 50.0);
        Vehicle motorcycle1 = new Motorcycle("B001", "Bentley", 30.0);
        Vehicle truck1 = new Truck("H001", "Honda Civic", 80.0);

        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(motorcycle1);
        rentalAgency.addVehicle(truck1);


        Customer customer1 = new Customer("HS001", "Hazel Scott");

        System.out.println("Available Vehicles:");
        List<Vehicle> availableVehicles = rentalAgency.getAvailableVehicles();
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle.getModel() + " (ID: " + vehicle.getVehicleId() + ")");
        }


        System.out.println("\nRenting a car...");
        car1.rent(customer1, 7);

        System.out.println("\nAvailable Vehicles after renting:");
        availableVehicles = rentalAgency.getAvailableVehicles();
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle.getModel() + " (ID: " + vehicle.getVehicleId() + ")");
        }


        System.out.println("\nReturning the car...");
        car1.returnVehicle();


        System.out.println("\nAvailable Vehicles after returning:");
        availableVehicles = rentalAgency.getAvailableVehicles();
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle.getModel() + " (ID: " + vehicle.getVehicleId() + ")");
        }


        double rentalCost = car1.calculateRentalCost(7);
        System.out.println("\nRental cost for 7 days: $" + rentalCost);
    }
}


