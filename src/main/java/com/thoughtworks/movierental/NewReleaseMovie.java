package com.thoughtworks.movierental;

public class NewReleaseMovie implements Price {

    private int daysRented;

    public NewReleaseMovie(int daysRented) {
        this.daysRented = daysRented;
    }

    @Override
    public int frequentRenterPoints() {
        return 2;
    }

    @Override
    public double amount() {
        double amount =0;
        amount += daysRented * 3;
        return amount;
    }
}
