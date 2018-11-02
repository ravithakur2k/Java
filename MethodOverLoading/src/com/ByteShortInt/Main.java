package com.ByteShortInt;

public class Main {


    static double feet = 0d;
    static double centimeters = 0d;
    public static void main(String[] args) {

       /* int newScore = calculateScore("Ravi", 500);
        System.out.println("New Score is " + newScore);
        int newScore1 = calculateScore(250);
        System.out.println("New Score 1 is " + newScore1);

        int newScore2 = calculateScore('a', 100);
        System.out.println("new score 2 is " + newScore2);*/

        double feet = 6;
        double inches = 13;
        double centimeters = calcFeetAndInchesToCentimetres(feet,inches);

        if(centimeters == -1){
            System.out.println( "invalid feet or inches parameters");
        }else{
            System.out.println(feet + " feet and " + inches + " inches in centimeters is " +centimeters + "cms");
        }

        inches = 72;
        double feet1 = calcFeetAndInchesToCentimetres(inches);
        System.out.println(inches + "inches in  centimeters is " + feet1 + "feet");


    }


   /* public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        score = score * 1000;
        return score;
    }

    public static int calculateScore(char playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        score = score * 1000;
        return score;
    }

    public static int calculateScore(int score) {

        System.out.println("Unnamed Player scored " + score + " points");
        score = score * 1000;
        return score;
    }*/

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {

        if (feet >= 0 && inches >=0 && inches<=12) {
            centimeters = ((feet*12) + inches) * 2.54;
            return centimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimetres(double inches) {

        if (inches >= 0) {
            feet = inches / 12;
            return feet;
        } else {
            return -1;
        }
    }


}
