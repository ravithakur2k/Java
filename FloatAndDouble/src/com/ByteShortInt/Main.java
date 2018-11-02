package com.ByteShortInt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 5/2;
        float myFloatValue = (float)2.3;
        float myFloatValue1 = 5f / 2;
        double myDoubleValue = 2.45;

        System.out.println("float value--"+myFloatValue1);
        System.out.println("float value-- "+myIntValue);

        //Store number of pounds

        int noOfPounds = 5;
        double noOfKgs = 0.45359237 * noOfPounds;
        System.out.println("Number of Kgs = " + noOfKgs);
        double pi = 3.14_31_5;
        System.out.println(pi);

    }
}
