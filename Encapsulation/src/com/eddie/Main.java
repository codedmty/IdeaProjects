package com.eddie;

public class Main {

    public static void main(String[] args) {
//
//        Player player = new Player();
//        player.name = "Eddie";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healtHRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healtHRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Eddie", 200, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}
