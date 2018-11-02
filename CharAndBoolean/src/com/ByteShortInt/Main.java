package com.ByteShortInt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // width of 16 (2 bytes)
        char myChar = 'o';
        char unicodeValueCopy = '\u00A9';
        char unicodeValueRegistered = '\u00ae';

        System.out.println("-----" + unicodeValueCopy +"--------" +unicodeValueRegistered);
    }
}
