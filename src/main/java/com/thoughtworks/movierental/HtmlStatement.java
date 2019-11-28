package com.thoughtworks.movierental;

public class HtmlStatement {
    private String name;
    private Rentals rentals;
    public HtmlStatement(String name, Rentals rentals) {
    this.name = name;
    this.rentals= rentals;
    }
    public String statement(){
        String result = "<h3>Rental Record for " + name + "</h3>\n";

        for (Rental rental : rentals) {
            result += "<p>\t" + rental.getMovie().getTitle() + "\t" +
                    rental.amount() + "</p>\n";
        }
        result += "<b>Amount owed is " + rentals.totalAmount() + "</b>\n";
        result += "<b>You earned " + rentals.totalFrequentRenterPoints()
                + " frequent renter points</b>";
        return result;
    }
}
