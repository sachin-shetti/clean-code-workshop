package com.thoughtworks.movierental;

public class TextStatement {
    private Rentals rentals;
    private String name;


    public TextStatement(Customer customer) {
        this.rentals = customer.getRentals();
        this.name = customer.getName();
    }

    public String statement(){
        String result = "Rental Record for " + name + "\n";

        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    rental.amount() + "\n";
        }
        result += "Amount owed is " + rentals.totalAmount() + "\n";
        result += "You earned " + rentals.totalFrequentRenterPoints()
                + " frequent renter points";
        return result;
    }
}
