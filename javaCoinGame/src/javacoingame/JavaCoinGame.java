/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoingame;
import java.util.Scanner;

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
        int score1 = 0, score2 = 0;
        String guess;
        CoinFace coinGuess;
        String player1, player2;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("This game simulates a coin flip toss for two players, \n " + 
                            "the objective of this game is for each player to guess \nwhat the coin's" +
                            " face is going to be. The first player to get to five points wins!!!\n");
        
        System.out.println("First we need the name of our first player!");
        player1 = keyboard.nextLine();
        
        System.out.println("Next  we need the name of our second player!");
        player2 = keyboard.nextLine();
        
        Player first = new Player(player1);
        Player second = new Player(player2);
        
        Coin toss = new Coin(first);
        Coin toss2 = new Coin(second);
        
        System.out.println("Let's start the game!!!");
        
        do {
            
            System.out.println("This is roll number " + (++heads));
            
            System.out.println("Player " + player1 + " what is your guess heads or tails?");
            guess = keyboard.nextLine();
            
            while(!guess.equalsIgnoreCase("heads") && !guess.equalsIgnoreCase("tails")){
                System.out.println("Please choose either heads or tails!");
                guess = keyboard.nextLine();
            }
            
            System.out.println("Player " + player1 + " you guess for " + guess +"!");
            System.out.println("Let's toss the coin and find out if your guess is correct!");
            toss.tossCoin();
            System.out.println("The coin's face is " + toss.getSideUp());
            
            if(guess.equalsIgnoreCase("heads")){
                coinGuess = CoinFace.HEADS;
            }
            else {
                coinGuess = CoinFace.TAILS;
            }
            
            if(coinGuess.equals(toss.getSideUp())){
                System.out.println("You guessed it correctly!!! +1 to your accumulated score!\n");
                first.setScore(score1 + 1);
            }
            else{
                System.out.println("You guessed it wrong!\n");
            }
            
            /*Player two's turn*/
            System.out.println("Now it's player " + player2 +"'s turn! What is your guess heads or tails?");
            guess = keyboard.nextLine();
            
            while(!guess.equalsIgnoreCase("heads") && !guess.equalsIgnoreCase("tails")){
                System.out.println("Please choose either heads or tails!");
                guess = keyboard.nextLine();
            }
            
            System.out.println("Player " + player2 + " you guess for " + guess +"!");
            System.out.println("Let's toss the coin and find out if your guess is correct!");
            toss2.tossCoin();
            System.out.println("The coin's face is " + toss2.getSideUp());
            
            if(guess.equalsIgnoreCase("heads")){
                coinGuess = CoinFace.HEADS;
            }
            else {
                coinGuess = CoinFace.TAILS;
            }
            
            if(coinGuess.equals(toss2.getSideUp())){
                System.out.println("You guessed it correctly!!! +1 to your accumulated score!\n");
                second.setScore(score2 + 1);
            }
            else{
                System.out.println("You guessed it wrong!\n");
            }
            
            System.out.println("The total score for each player is as follows:");
            System.out.println(first);
            System.out.println(second);
            System.out.println("\n");
            
        } while(first.getScore() != 5 && second.getScore() != 5);
        
        
        if(first.getScore() > second.getScore()){
            System.out.println("Player " + player1 + " wins!");
        }
        else {
            System.out.println("Player " + player2 + " wins!");
        }
        /*
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
        */
    }
    
}
