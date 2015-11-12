/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.GROUPE3;

import java.util.List;

/**
 *
 * @author mccstan
 */
public class SalaireCalculator 
{
    public double salaireTotal(List<Salaried> salarieds)
    {
        double salaireTotal=0;
        for(Salaried salaried : salarieds)
        {
            salaireTotal += salaried.salaire();
        }
        return salaireTotal;
    }
    
}
