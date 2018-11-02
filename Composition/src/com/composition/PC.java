package com.composition;

public class PC {

    private Monitor monitor;
    private Case theCase;
    private MotherBoard motherBoard;

    public PC(Monitor monitor, Case theCase, MotherBoard motherBoard) {
        this.monitor = monitor;
        this.theCase = theCase;
        this.motherBoard = motherBoard;
    }

    public void upPower(){

        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        getMonitor().drawPixelAt(1200,50,"yellow");
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Case getTheCase() {
        return theCase;
    }

    private MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
