package com.OOPS;

public class Main {

    public static void main(String[] args) {

        BankAccount bank = new BankAccount();
        bank.setBalance(500);
        bank.depositFunds(500);
        bank.withdrawFunds(600);


    }
}
