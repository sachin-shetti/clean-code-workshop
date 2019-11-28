package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void textStatement() {
        Customer customer = new Customer("foo");
        customer.addRental(new Rental(new Movie("movie 1",Movie.CHILDRENS),1));
        customer.addRental(new Rental(new Movie("movie 2",Movie.REGULAR),2));
        customer.addRental(new Rental(new Movie("movie 3",Movie.NEW_RELEASE),3));
        customer.addRental(new Rental(new Movie("movie 4",Movie.SCIFI),4));
        Assert.assertEquals("Rental Record for foo\n" +
                "\tmovie 1\t1.5\n" +
                "\tmovie 2\t2.0\n" +
                "\tmovie 3\t9.0\n" +
                "\tmovie 4\t16.0\n" +
                "Amount owed is 28.5\n" +
                "You earned 8 frequent renter points",customer.statement());
    }

    @Test
    public void htmlStatement() {
        Customer customer = new Customer("foo");
        customer.addRental(new Rental(new Movie("movie 1",Movie.CHILDRENS),1));
        customer.addRental(new Rental(new Movie("movie 2",Movie.REGULAR),2));
        customer.addRental(new Rental(new Movie("movie 3",Movie.NEW_RELEASE),3));
        customer.addRental(new Rental(new Movie("movie 4",Movie.SCIFI),4));
        Assert.assertEquals("<h3>Rental Record for foo</h3>\n" +
                "<p>\tmovie 1\t1.5</p>\n" +
                "<p>\tmovie 2\t2.0</p>\n" +
                "<p>\tmovie 3\t9.0</p>\n" +
                "<p>\tmovie 4\t16.0</p>\n" +
                "<b>Amount owed is 28.5</b>\n" +
                "<b>You earned 8 frequent renter points</b>",customer.htmlStatement());
    }

}