/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

/**
 *
 * @author tewan2657
 */
public class Deck {

    //Instance Variables
    private Card[] cards;
    private int numCards;
    private boolean isShuffled;

    public Deck() {
        this.numCards = 52;
        this.isShuffled = false;

        this.cards = new Card[52];
        // put cards into the deck
        for (int rank = 1; rank <= 13; rank++) {
            for (int suit = 0; suit < 4; suit++) {
              Card c = new Card(rank, suit);
              this.cards[13*suit + rank - 1] = c;
            }
        }
    }
    
    public void shuffle(){
        //Knuth shuffle algorithm 
        for (int i = 0; i < numCards; i++) {
            //generate random spot to swap with 
            int spot = (int)(Math.random()*(numCards - i) + i);
            Card temp = cards[i];
            cards[i] = cards[spot];
            cards[spot] = temp;
        }
    }    
    
}
