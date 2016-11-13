/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoingame;
import java.util.Random;
 
/**
 *
 * @author Kenneth R. Kutschera
 */
public class Coin {
    
    private CoinFace sideUp;
    
    public Coin(){
        Random rand = new Random();
        int coin = rand.nextInt(2);
        
        if (coin == 1){
            this.sideUp = CoinFace.HEADS;
        }
        else {
            this.sideUp = CoinFace.TAILS;
        }
    }
    
    public void tossCoin(){
        Random rand = new Random();
        int coin = rand.nextInt(2);
        
        if (coin == 1){
            this.sideUp = CoinFace.HEADS;
        }
        else {
            this.sideUp = CoinFace.TAILS;
        }
    }
    
    public CoinFace getSideUp(){
       
        return sideUp;
    }
     
    public String toSTring(){
        String str = (" " + sideUp);
        return str;
    }
}
