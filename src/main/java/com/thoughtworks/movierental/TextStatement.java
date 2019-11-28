package com.thoughtworks.movierental;

public class TextStatement {
    private Rentals rentals;
    private String name;


    public TextStatement(String name, Rentals rentals) {
        this.rentals = rentals;
        this.name = name;
    }

    public String statement(){
        String result = "Rental Record for " + name + "\n";

        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    rental.amount() + "\n";
        }
        result += "Amount owed is " + rentals.totalAmount() + "\n";
        result += "You earned " + rentals.frequentRenterPoints()
                + " frequent renter points";
        return result;
    }
}
