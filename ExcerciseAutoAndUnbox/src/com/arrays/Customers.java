package com.arrays;

import java.util.ArrayList;

public class Customers {

    private static ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customers(String name) {
        this.name = name;
    }

    public static ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }
}
