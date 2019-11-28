package com.thoughtworks.movierental;

public class RegularMovie implements Price {

    int daysRented;

    public RegularMovie(int daysRented) {
        this.daysRented = daysRented;
    }


    @Override
    public int frequentRenterPoints() {
        return 1;
    }

    @Override
    public double amount() {
        double amount = 2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }
}
