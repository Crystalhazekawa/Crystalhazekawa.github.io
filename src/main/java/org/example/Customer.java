package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    public boolean isEligibleForRental() {
        // Example eligibility check: a customer can rent if they have no overdue rentals
        for (RentalTransaction transaction : rentalHistory) {
            if (!transaction.isReturned()) {
                return false; // Not eligible if there's an ongoing rental
            }
        }
        return true; // Eligible if no ongoing rentals
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId:'" + customerId + '\'' +
                ", name:'" + name + '\'' +
                '}';
    }
}



