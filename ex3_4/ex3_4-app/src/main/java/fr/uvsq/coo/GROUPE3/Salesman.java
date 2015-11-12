/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.GROUPE3;

/**
 *
 * @author mccstan
 */
public class Salesman implements Salaried
{
    private double baseSalaire=1500;
    private double baseAnciennete=20;
    private int nbAnnee;
    private double commission;
    @Override
    public double salaire() 
    {
        return baseSalaire + (nbAnnee * baseAnciennete) + commission;
    }
    
}
