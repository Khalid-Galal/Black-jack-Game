/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Khaled
 */
public class Card {
    
     private final int suit , rank, value;

     public Card() {
        this.suit = 0;
        this.rank = 0;
        this.value = 0;
    }
    public Card(int su, int ra, int val) {
        suit = su;
        rank = ra;
        value = val;
    }
    
    public Card(Card card)
    {
        this.suit = card.suit;
        this.rank = card.rank;
        this.value = card.value;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

   
    
}
