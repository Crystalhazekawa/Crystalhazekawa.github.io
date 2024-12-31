package org.example;

public class Car extends Vehicle implements Rentable {

    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate () * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
    public void rent(Customer customer, int days ){
        if (isAvailableForRental()) {
            setAvailable(false);

    }

    }
    @Override
    public void returnVehicle() {
        setAvailable(true);
    }


}


