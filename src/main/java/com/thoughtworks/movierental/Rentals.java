package com.thoughtworks.movierental;

import java.util.ArrayList;

public class Rentals extends  ArrayList<Rental>{
    public double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : this) {
            totalAmount += rental.amount();
        }
        return totalAmount;
    }

     public int frequentRenterPoints() {
        int frequentRenterPoints=0;
        for (Rental rental : this) {
            frequentRenterPoints++;
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    &&
                    rental.getDaysRented() > 1) frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}
