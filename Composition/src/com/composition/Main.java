package com.composition;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 05);
        Case theCase = new Case("220B", "Ravi", "BESCOM", dimensions);

        Resolution resolution = new Resolution(2540, 1440);
        Monitor theMonitor = new Monitor("27inch the Beast", 27, "Acer", resolution);

        MotherBoard theMotherBoard = new MotherBoard("BJ-200","3","Asus","2","v2.44");

        PC thePC = new PC(theMonitor,theCase,theMotherBoard);
        thePC.upPower();
    }
}
