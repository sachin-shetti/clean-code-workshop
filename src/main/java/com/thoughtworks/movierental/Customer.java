package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        String result = "Rental Record for " + getName() + "\n";
        int frequentRenterPoints = frequentRenterPoints();

        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    rental.amount() + "\n";
            totalAmount += rental.amount();
        }

        //add footer lines result
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints
                + " frequent renter points";
        return result;
    }

    private int frequentRenterPoints() {
        int frequentRenterPoints=0;
        for (Rental rental : rentals) {
            frequentRenterPoints++;
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    &&
                    rental.getDaysRented() > 1) frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

}

