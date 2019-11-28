package com.thoughtworks.movierental;

public class SciFiMovie implements Price {

    private int daysRented;

    public SciFiMovie(int daysRented) {
        this.daysRented = daysRented;
    }

    @Override
    public int frequentRenterPoints() {
        return 4;
    }

    @Override
    public double amount() {
        double amount =0;
        amount += daysRented * 4;
        return amount;
    }
}
