package com.ByteShortInt;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*String lastString = "10";
        int myValue = 10;
        lastString = lastString + myValue;
        System.out.println("last String value equals " + lastString);



        boolean isAlien = true;
        if(isAlien){
            System.out.println("it is an alien");
        }*/


        double doubleValue = 20d;
        double secondValue = 80d;
        double result = (doubleValue+secondValue) * 25d;
        System.out.println("result value is = " +result);
        double remainder = result%40;
        System.out.println("remainder value is = " +remainder);
        if(remainder <= 20){
            System.out.println("Total was over the limit");
        }

    }
}
