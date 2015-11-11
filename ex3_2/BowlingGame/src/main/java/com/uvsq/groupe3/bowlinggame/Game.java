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
        int frameIndex=0;
        for(int frame=0; frame < 10;  frame++)
        {
            if(isStrike(frameIndex)) //spare
            {
                score += 10 + strikeBonus(frameIndex);
                frameIndex ++;
            }
            else if(isSpare(frameIndex))
            {
                score += 10 + spareBonus(frameIndex);
            }
            else
            {
                score += sumOfBallsInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }
    private boolean isStrike(int frameIndex) 
    {
        return rolls[frameIndex] == 10;
    }
    
    private int sumOfBallsInFrame(int frameIndex) 
    {
        return rolls[frameIndex]+rolls[frameIndex+1];
    }
    private int spareBonus(int frameIndex) 
    {
        return rolls[frameIndex + 2];
    }
    private int strikeBonus(int frameIndex) 
    {
        return rolls[frameIndex+1]+rolls[frameIndex+2];
    }
    
    private boolean isSpare(int frameIdex)
    {
        return rolls[frameIdex] +
                   rolls[frameIdex + 1] == 10;
    }
    
}
