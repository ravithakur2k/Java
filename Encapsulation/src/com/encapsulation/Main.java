package com.encapsulation;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Ravi";
        player.health = 10;
        player.weapon = "sword";

        player.loseHealth(9);
        int rh = player.remainingHealth();
        if(rh>0) {
            System.out.println("Remaining health of player is " + rh);

        }

    }
}
