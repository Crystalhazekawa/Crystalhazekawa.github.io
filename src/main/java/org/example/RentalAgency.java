package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalAgency {
    private List<Vehicle> vehicles;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        vehicles = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        return vehicles.stream()
                .filter(Vehicle::isAvailableForRental)
                .collect(Collectors.toList());
    }


    public void returnVehicle(RentalTransaction transaction) {
        transaction.getVehicle().returnVehicle();
        transaction.markAsReturned();
    }

    public List<RentalTransaction> getRentalHistory() {
        return transactions;
    }


    @Override
    public String toString() {
        return "RentalAgency{" +
                "vehicles=" + vehicles.size() +
                ", transactions=" + transactions.size() +
                '}';
    }
}






