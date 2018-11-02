package com.ByteShortInt;

public class Main {

    public static void main(String[] args) {

        //int width is 32
        int minVal = -2_147_483_648;
        //byte width is 8
        //short width is 16
        //long width is 64


        byte byteVar = 100;
        short shortVar = -31000;
        int intVar = 50000;
        long longVar = 50000 + 10*(byteVar+shortVar+intVar);
        long lonValue = (byteVar/2);

        System.out.println(longVar);
    }
}
