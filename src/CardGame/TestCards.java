/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

/**
 *
 * @author tewan2657
 */
public class TestCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.printDeck();
        
        //space
        System.out.println("");
        System.out.println("");
        
        Card c = deck.dealCard();
        System.out.println("Card: " + c);
        c = deck.dealCard();
        System.out.println("Card: " + c);
        c = deck.dealCard();
        System.out.println("Card: " + c);

    }
}