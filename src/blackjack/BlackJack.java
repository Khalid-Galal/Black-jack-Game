/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author Khaled
 */
public class BlackJack {

   static Game game=new Game();
    public static void main(String[] args) {
        // TODO code application logic here
        
        game.generate();
        game.begin();
    }
    
    
    public void game_logic()
    {
        Scanner scann=new Scanner(System.in);
        String check="";
                 
            
       
        for (int i = 0; i < 3; i++)
        {
            while (!check.toLowerCase().equals("stand")) {   
            check=scann.next();
            //to check each player if he want to hit or stand 
            if (check.toLowerCase().equals("hit"))
            {
                
            }
            }
        
        }
        
        
    }
}
