package com.composition;

public class Sofa {

    private String color;
    private int handBars;
    private  String legKeeper;

    public Sofa(String color, int handBars, String legKeeper) {
        this.color = color;
        this.handBars = handBars;
        this.legKeeper = legKeeper;
    }

    public void compressor(int x){
        System.out.println("Sofa compresses to "+x+" inches downwards when sat on it");
    }


    public String getColor() {
        return color;
    }

    public int getHandBars() {
        return handBars;
    }

    public String getLegKeeper() {
        return legKeeper;
    }
}
