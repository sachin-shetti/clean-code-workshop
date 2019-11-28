package com.thoughtworks.movierental;

public class Rental {

    private int daysRented;
    private Movie movie;
    private Price price;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double amount() {
        double amount = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                price = new RegularMovie(daysRented);
                amount = price.amount();
                break;
            case Movie.NEW_RELEASE:
               price = new NewReleaseMovie(daysRented);
               amount = price.amount();
                break;
            case Movie.CHILDRENS:
                price = new ChildrenMovie(daysRented);
                amount = price.amount();
                break;
            case Movie.SCIFI:
                price = new SciFiMovie(daysRented);
                amount = price.amount();
        }
        return amount;
    }

    int frequentRenterPoints() {
        return price.frequentRenterPoints();
    }
}