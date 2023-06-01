/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice_first;

import java.util.Random;
import java.util.Scanner;


public class ICE_First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-10, 11 for Jack, 12 for Queen, 13 for King): ");
        int value = scanner.nextInt();

        System.out.print("Enter the suit of your card (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades): ");
        int suit = scanner.nextInt();

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);

        // Search the hand for a match
        boolean foundMatch = false;
        for (Card card : hand) {
            if (card.equals(userCard)) {
                foundMatch = true;
                break;
            }
        }

        if (foundMatch) {
        } else {
            System.out.println("Sorry, no match found.");
        }

        scanner.close();
    }

    
  }
    

