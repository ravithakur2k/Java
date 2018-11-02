package com.composition;

public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed(4,"americanPillow","IndianBedSheet");
        Table table = new Table(6,2,"maroon");
        Sofa sofa = new Sofa("blue",4,"crazyLegKeeper");

        Home home = new Home(bed,table,sofa);

        home.getBed().extendableBed(50,100);
        home.getTable().movableTable(10,20);
        home.getSofa().compressor(5);


    }
}
