package com.composition;

public class Table {

    private int legs;
    private int drawer;
    private String color;

    public Table(int legs, int drawer, String color) {
        legs = legs;
        drawer = drawer;
        this.color = color;
    }

    public void movableTable(int front, int back){

        System.out.println("table moves "+front+" metres in front and "+back+" metres backwards");
    }

    public int getLegs() {
        return legs;
    }

    public int getDrawer() {
        return drawer;
    }

    public String getColor() {
        return color;
    }
}
