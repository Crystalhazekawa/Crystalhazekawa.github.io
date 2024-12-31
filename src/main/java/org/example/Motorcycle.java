package org.example;

public class Motorcycle extends Vehicle implements Rentable {

    public Motorcycle(String vehicleId,String model,double pricePerKm ) {
        super(vehicleId, model, pricePerKm);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
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
