package PossibleSolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();

        Hand dealer = new Hand(deck.deal(), deck.deal());
        Hand player = new Hand(deck.deal(), deck.deal());
    
        int playerPoints = player.getPoints();
        int dealerPoints;

        System.out.println("Here is your hand.");
        player.display();
        playerPoints = player.getPoints();
        System.out.println("You have " + playerPoints + " points.");

        int choice = 1;
        while (choice == 1 && playerPoints < 21 && player.numCards < 5) {
            System.out.println("Would you like another card?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            choice = reader.nextInt();

            if (choice == 1) {
                player.hit(deck.deal());
                System.out.println("Here is your hand.");
                player.display();
                playerPoints = player.getPoints();
                System.out.println("You have " + playerPoints + " points.");
            }     
        }

        dealerPoints = dealer.getPoints();
        while (dealerPoints < 16 && dealer.numCards < 5) {
            dealer.hit(deck.deal());
            dealerPoints = dealer.getPoints();
        }

        System.out.println("Dealer has: ");
        dealer.display();
        System.out.println("Dealer has " + dealerPoints + " points.");

        if (playerPoints > 21) {
            System.out.println("Player busted! Dealer wins!");
        } else if (dealerPoints > 21) {
            System.out.println("Dealer busted! Player wins.");
        } else if (dealerPoints > playerPoints) {
            System.out.println("Dealer wins!");
        } else if (dealerPoints < playerPoints) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer & Player tied.");
        }
    reader.close();
    }
}