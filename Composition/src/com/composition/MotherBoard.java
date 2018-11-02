package com.composition;

public class MotherBoard {

    private String model;
    private String cardSlots;
    private String manufacturer;
    private String ramSlots;
    private String bios;

    public MotherBoard(String model, String cardSlots, String manufacturer, String ramSlots, String bios) {
        this.model = model;
        this.cardSlots = cardSlots;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + "is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getCardSlots() {
        return cardSlots;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getRamSlots() {
        return ramSlots;
    }

    public String getBios() {
        return bios;
    }
}
