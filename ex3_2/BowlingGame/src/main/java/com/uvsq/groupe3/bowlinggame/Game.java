/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvsq.groupe3.bowlinggame;

/**
 *
 * @author mccstan
 */
public class Game {
    private int score=0;
    private int rolls[]=new int[21];
    private int currentRoll=0;

    /**
     *
     * @param pins
     */
    public void roll(int pins)
    {
        score+=pins;
        rolls[currentRoll++]=pins;
    }
    
    public int score()
    {
        int score=0;
        int i=0;
        for(int frame=0; frame<10;  frame++)
        {
            score += rolls[i] + rolls[i+1];
            i += 2;
        }
        return score;
    }
}
