package com.encapsulation;

public class Printer {

    private int TonerLevel;
    private int noOfPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int noOfPages, boolean isDuplex) {
        this.TonerLevel = tonerLevel;
        this.noOfPages = noOfPages;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner() {
        if (TonerLevel > 0 && TonerLevel <= 100) {
            System.out.println("Toner filled by " + TonerLevel+ "%");
        }else{
            System.out.println("invalid TonerLevel");
        }
    }

    public void simulatePrinting(){
        if(isDuplex == false){
            System.out.println("Printing pages are "+noOfPages+" in number");
        }else{
            noOfPages = noOfPages/2;
            System.out.println("Printing pages are "+noOfPages+" in number");
        }

    }

    public int getTonerLevel() {
        return TonerLevel;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
