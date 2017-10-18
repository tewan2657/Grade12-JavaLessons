/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

import java.util.ArrayList;

/**
 *
 * @author tewan2657
 */
public class War {

    public static int winner(Card p1Card, Card p2Card) {
        //did a war happen?
        if (p1Card.getRank() == p2Card.getRank()) {
            System.out.println("WAR");
            return 0;
            // Check if ACE Played  
            //Player 1 wins
        } else if (p1Card.getRank() == 1 || (p1Card.isBigger(p2Card) && p2Card.getRank() != 1)) {
            System.out.println("Player 1 Wins");
            return 1;

            //player 2 wins
        } else {
            System.out.println("Player 2 Wins");
            return 2;

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create deck of Cards
        Deck deck = new Deck();
        //create some players
        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");

        // Shuffle deck and deal Cards
        deck.shuffle();
        for (int i = 0; i < 52; i++) {
            //Alternate Card Taking
            if (i % 2 == 0) {
                p1.takeCard(deck.dealCard());
            } else {
                p2.takeCard(deck.dealCard());
            }
        }
        //Game Time!
        // As long as player have cards
        while (p1.getnumCards() > 0 && p2.getnumCards() > 0) {
            //Player 1s card
            Card p1Card = p1.playCard();
            System.out.println("Player 1 plays " + p1Card);

            //player 2s card
            Card p2Card = p2.playCard();
            System.out.println("Player 2 plays " + p2Card);

            //Who wins?
            int winner = winner(p1Card, p2Card);
            if (winner == 0) {
                System.out.println("WAR");

                //Create Card Piles for cards
                ArrayList<Card> pile = new ArrayList<>();



                 // keep playing until someone wins
                while (winner == 0) {
                    // make sure players have enough cards
                    if(p1.getnumCards()< 4){
                        System.out.println("Player 1 ran out of cards for a war");
                        // p1 loses, p2 wins!
                        winner = 2;
                        // get rid of cards
                        while(p1.getnumCards() > 0){
                            p1.playCard();
                        }
                        break;
                    }else if(p2.getnumCards() < 4){
                        System.out.println("Player 2 ran out of cards for a war");
                        // p2 loses, p1 wins!
                        winner = 1;
                        // get rid of cards
                        while(p2.getnumCards() > 0){
                            p2.playCard();
                        }
                        break;
                    }

                    //add in already played cards
                    pile.add(p1Card);
                    pile.add(p2Card);

                    //Draw 3 cards from 
                    // each player to add to pile
                    Card[] p1Cards = p1.get3Cards();
                    Card[] p2Cards = p2.get3Cards();
                    for (int i = 0; i < 3; i++) {
                        pile.add(p1Cards[i]);
                        pile.add(p2Cards[i]);
                    }
                    //new Card for each player
                    p1Card = p1.playCard();
                    p2Card = p2.playCard();
                    System.out.println("Player 1 Plays " + p1Card);
                    System.out.println("Player 2 Plays " + p2Card);
                    winner = winner(p1Card, p2Card);
                }
              
                //war is over
                // add pile to Victor!
                if(winner ==1){
                    //for each card in this pile
                    for(Card aCard: pile){
                        p1.takeCard(aCard);
                    }
                }else{
                     for(Card aCard: pile){
                        p2.takeCard(aCard);
                }
                }
             
                // Check if ACE Played  
                //Player 1 wins
               if (winner == 1) {
                System.out.println("Player 1 Wins");
                //take both cards
                p1.takeCard(p2Card);
                p1.takeCard(p1Card);

                //player 2 wins
            } else {
                //Take Both cards 
                p2.takeCard(p1Card);
                p2.takeCard(p2Card);
            }
            // Space tp seperate rounds 
            System.out.println("");

        }
            //Player 1 wins
            if(p1.getnumCards()>0){
                System.out.println("Player 1  WINS!");
            }else{
                //Player 2 wins
                System.out.println("Player 2 WINS!");    
            }
            
            
    }
    }
    }
