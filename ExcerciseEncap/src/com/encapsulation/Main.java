package com.encapsulation;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(50,100,true);
	System.out.println(printer.getTonerLevel());

	printer.fillUpToner();
	printer.simulatePrinting();
    }
}
