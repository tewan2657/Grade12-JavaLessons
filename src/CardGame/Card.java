/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

/**
 * A class to represent
 *
 * @author tewan2657
 */
public class Card {
    //Suit constants
   public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int SPADES = 2;
    public static final int HEARTS = 3;
    
//Instance variables
    private int rank;
    private int suit;

    //Constructor
    /**
     * This is the constructor for a single playing card
     * @param rank the rank of the card (1-13)
     * @param suit the suit of the card
     */
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;

    }

    /**
     * Get the suit of the card
     * @return the suit of the card
     */
    public int getSuit() {
        return suit;
    }

    /**
     * gets the rank of the card
     * @return the rank of the card
     */
    public int getRank() {
        return rank;
    }
    
    /**
     * Determines if this card is bigger than another card
     * @param c the card used to check against 
     * @return true if the card is bigger than card c.
     */
    public boolean isBigger(Card c) {
        //is this card bigger than the one passed in 
        if (this.rank > c.rank) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}