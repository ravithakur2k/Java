package com.ByteShortInt;

public class Main {

    public static void main(String[] args) {
        /*int score = 50001;
        if (score == 5000) {
            System.out.println("Score is 5000");
        } else if (score != 5000) {
            System.out.println("not equal to 5000");
        }
        boolean gameOver = true;
        int secondScore = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver) {
            int finalScore = secondScore + (levelCompleted * bonus);
            System.out.println(finalScore);
        }

        boolean gameOver = true;
        int score = 50;
        int levelComplete = 80;
        int bonus = 100;
        int returnedValue = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println(returnedValue);

        score = 100;
        levelComplete = 500;
        bonus = 1000;
        calculateScore(gameOver, score, levelComplete, bonus);

    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        if (gameOver) {

            int finalScore = score + (levelComplete * bonus);
            finalScore += 1000;
            System.out.println("final score is = " + finalScore);
            return finalScore;
        } else{
            return -1;
        }
       }*/
        int returnedValue = calculateHighScorePosition(1000);
        displayHighScorePosition("Ravi", returnedValue);
        int returnedValue1 = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", returnedValue1);
        int returnedValue2 = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", returnedValue2);
        int returnedValue3 = calculateHighScorePosition(50);
        displayHighScorePosition("Jackson", returnedValue3);



    }

    public static void displayHighScorePosition(String playersName, int positionInHighScoreTable) {

        System.out.println(playersName + " managed to  get into position " + positionInHighScoreTable + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore <= 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }


}
