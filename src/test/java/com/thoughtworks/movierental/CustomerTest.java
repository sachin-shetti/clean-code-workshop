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
        Assert.assertEquals("Rental Record for foo\n" +
                "\tmovie 1\t1.5\n" +
                "\tmovie 2\t2.0\n" +
                "\tmovie 3\t9.0\n" +
                "Amount owed is 12.5\n" +
                "You earned 4 frequent renter points",customer.statement());

    }

}