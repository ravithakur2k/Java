package com.OOPS;

public class BankAccount {

    private long accountNumber;
    private  double balance;
    private String customerName;
    private String email;
    private long mobileNumber;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public  void depositFunds(double depositMoney){

            this.balance += depositMoney;
        System.out.println("total balance after depositing  "+depositMoney+"Rs is " +balance);
    }

    public  void withdrawFunds(double withdrawMoney){

        if(withdrawMoney > this.balance){
            System.out.println(" insufficient funds ");
        }else{
            this.balance -= withdrawMoney;
            System.out.println("total balance after withdrawing "+withdrawMoney+"Rs is "+balance);
        }
    }
}
