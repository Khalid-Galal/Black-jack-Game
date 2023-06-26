/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Khaled
 */
public class Game {

    public Player[] players = new Player[4];
    int high_Score;
    //To creat a deck
    Card[] cards_deck = new Card[52];

    Random rand = new Random();

    void generate() {
        //for each card 

        //for generating suit
        int count=0;
        for (int i = 0; i < 4; i++) {
            //for generating rank
            for (int j = 0; j < 13; j++) {

                if (j < 10) {

                    int val = j + 1;
                    Card one_card = new Card(i, j, val);
                    cards_deck[count]=one_card;
                }
                else if(j >= 10){
                    int val = 10;
                    Card one_card = new Card(i, j, val);
                     //to put each card into a deck of cards
                    cards_deck[count]=one_card;
                }

                count++;
            }
        }

    }

    void display_Cards() {
        for (int i = 0; i < 52; i++) {
            System.out.println(cards_deck[i].getSuit());
            System.out.println(cards_deck[i].getRank());
            System.out.println(cards_deck[i].getValue());
        }
    }

    public Card Drow() {

        //for genrating random number
        Random rng = new Random();

        //creat new card to put into
        Card temp = null;

        int j;
        for (int i = 0; i < 52; i++) {
            j = rng.nextInt(51);
            //to make sure it is not equle null 
            if(cards_deck[j]==null)
                continue;
            else{
            temp = cards_deck[j];
            cards_deck[j] = null;
            }
        }
        return temp;

    }

    //To set players info and begin the game
    public void begin() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the players name");
        for (int i = 0; i < players.length-1; i++) {
            System.out.println("Enter name of player"+(i+1)+":");
           
            players[i]=new Player();
            players[i].Name = input.next();
            players[i].addcard(this.Drow());
            players[i].addcard(this.Drow());
            

        }
        players[3]=new Player();
        players[3].Name="Dealer";
        players[3].addcard(this.Drow());
        players[3].addcard(this.Drow());
    }

//    public int update() {
//        int m = 0;
//        int max = 0;
//        for (int i = 0; i < 4; i++) {
//            if (Player[i].Score > max) {
//                max = Player[i].Score;
//                m = i;
//            }
//
//        }
//        System.out.print(Player[m].name);
//
//        return max;
//    }
    //A function to update the game maximum score of all players 
    //after any player draw a card to his hand.

}
