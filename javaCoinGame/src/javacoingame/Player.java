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
public class Player {
    private String name;
    private int score;
    
    public Player(){
        this.name = "";
        this.score = 0;
      
    }
    
    public Player(String name){
        this.name = name;
        this.score = 0;
    }
    
    public Player(Player obj){
        this.name = obj.name;
        this.score = obj.score; 
        
    }
    public Player copy(){
        Player copyObject = new Player(name);
        return copyObject;
        
    }
    
    public void setScore(int scr){
        this.score += scr;
    }
    
    public int getScore(){
        return score;
    }
    
    @Override
    public String toString(){
        String str = "Player " + name + " has a score of " + score;
        return str;
    }
    
}
