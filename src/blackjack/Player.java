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
public class Player {
    
    public String Name;
    public int Score=0;
    //To know all cards with each player
    private Card []hand=new Card[11];
    boolean lose;
    private int card_count=0;
    
    public void addcard(Card card) {
        if(card_count<11)
        {
            hand[card_count]=card;
            card_count++;
            Score+=card.getValue();
        }
        
        
    }

    public Card[] getHand() {
        return hand;
    }

   

   

    
    
}
