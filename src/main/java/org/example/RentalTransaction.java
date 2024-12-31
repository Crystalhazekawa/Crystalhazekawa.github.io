package org.example;
import java.time.LocalDate;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private LocalDate rentalDate;
    private boolean returned;

    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.rentalDate = LocalDate.now();
        this.returned = false;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void markAsReturned() {
        this.returned = true;
    }

    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "vehicle=" + vehicle.getModel() +
                ", customer=" + customer.getName() +
                ", rentalDays=" + rentalDays +
                ", rentalDate=" + rentalDate +
                ", returned=" + returned +
                '}';
    }
}


