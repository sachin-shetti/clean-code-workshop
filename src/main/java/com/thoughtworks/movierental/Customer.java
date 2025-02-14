package com.thoughtworks.movierental;

public class Customer {
    private String name;
    private Rentals rentals = new Rentals() ;

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public Rentals getRentals() {
        return rentals;
    }

    public String statement() {
         return new TextStatement(this).statement();
    }

    public String htmlStatement() {
        return new HtmlStatement(this).statement();
    }

}

