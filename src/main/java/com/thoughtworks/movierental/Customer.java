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
        String result = "Rental Record for " + getName() + "\n";

        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    rental.amount() + "\n";
        }
        result += "Amount owed is " + totalAmount(rentals) + "\n";
        result += "You earned " + frequentRenterPoints()
                + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<h3>Rental Record for " + getName() + "</h3>\n";

        for (Rental rental : rentals) {
            result += "<p>\t" + rental.getMovie().getTitle() + "\t" +
                    rental.amount() + "</p>\n";
        }
        result += "<b>Amount owed is " + totalAmount(rentals) + "</b>\n";
        result += "<b>You earned " + frequentRenterPoints()
                + " frequent renter points</b>";
        return result;
    }

    private static double totalAmount(List<Rental> rentals) {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.amount();
        }
        return totalAmount;
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

