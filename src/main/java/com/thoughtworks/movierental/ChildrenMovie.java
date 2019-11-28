package com.thoughtworks.movierental;

public class ChildrenMovie implements Price {
    private  int daysRented;

    public ChildrenMovie(int daysRented) {
        this.daysRented = daysRented;
    }

    @Override
    public int frequentRenterPoints() {
        return 1;
    }

    @Override
    public double amount() {
        double amount = 0;
        amount += 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;

        return amount;
    }
}
