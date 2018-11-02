package com.composition;

public class Bed {

    private int legs;
    private String pillow;
    private String bedSheet;

    public Bed(int legs, String pillow, String bedSheet) {
        this.legs = legs;
        this.pillow = pillow;
        this.bedSheet = bedSheet;
    }

    public void extendableBed(int x, int y) {

        System.out.println("Leg extension in front is " + x + " metres and lay backwards it is " + y + "metres");
    }

    public int getLegs() {
        return legs;
    }

    public String getPillow() {
        return pillow;
    }

    public String getBedSheet() {
        return bedSheet;
    }
}
