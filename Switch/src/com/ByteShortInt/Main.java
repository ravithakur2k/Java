package com.ByteShortInt;


public class Main {

    public static void main(String[] args) {
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("either 3 or 4 or 5");
                break;
            default:
                System.out.println("nor 1 or 2");
        }

        switchChar();
    }

    public static void switchChar() {

        char alphabets = 'F';
        switch (alphabets) {

            case 'A':
                System.out.println("Alphabet character is A");
                break;
            case 'B':
                System.out.println("Alphabet character is B");
                break;
            case 'C':
                System.out.println("Alphabet character is C");
                break;
            case 'D':
                System.out.println("Alphabet character is D");
                break;
            case 'E':
                System.out.println("Alphabet character is E");
                break;
            default:
                System.out.println("no alphabet found");


        }
    }
}
