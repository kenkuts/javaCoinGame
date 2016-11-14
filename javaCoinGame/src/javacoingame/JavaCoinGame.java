/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoingame;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class JavaCoinGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int heads = 0;
        int tails = 0;
        Coin toss = new Coin();
        
        System.out.println("The coin is initially facing " + toss.getSideUp());
        
        System.out.println("Let's start the game!!!");
        
        for (int r = 1; r <= 20; r++)
        {
            System.out.println("This is coin toss # " + r);
            toss.tossCoin();
            System.out.println("The coins face is now " + toss.getSideUp());
            if (toss.getSideUp().equals(CoinFace.HEADS))
            {
                heads++;
            }
            else {
                tails++;
            }
            
        }
        
        System.out.println("The coin landed on heads " + heads + " times.");
        System.out.println("The coin landed on tails " + tails + " times.");
    }
    
}
