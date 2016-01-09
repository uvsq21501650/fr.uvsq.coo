/**
  *
  *@name Personne
  *
  */

package fr.uvsq.coo.GROUPE3;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Personnel implements Element,  Serializable
{
  private String nom;
  private String prenom;
  private LocalDate dateNaissance;
  private List<String> numsTelephone;
  private String fonction;

    public Personnel(Builder builder) {
        this.nom=builder.nom;
        this.prenom=builder.prenom;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public List<String> getNumsTelephone() {
        return numsTelephone;
    }

    public void setNumsTelephone(List<String> numsTelephone) {
        this.numsTelephone = numsTelephone;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    
  public static class Builder
  {
    //Params requis
    private String nom;
    private String prenom;

    //params optionnels
    private LocalDate dateNaissance=LocalDate.of(2015, Month.DECEMBER,1);
    private List<String> numsTelephone=new ArrayList<>();
    private String fonction="Non défini";

    public Builder(String nom, String prenom)
    {
        this.nom=nom;
        this.prenom=prenom;
    }

    public Builder localDate(LocalDate dateNaissance)
    {
      this.dateNaissance=dateNaissance;
      return this;
    }

    public Builder numsTelephone(List<String> numsTelephone)
    {
      this.numsTelephone=numsTelephone;
      return this;
    }

    public Builder localDate(String fonction)
    {
      this.fonction=fonction;
      return this;
    }

    public Personnel build()
    {
      return new Personnel(this);
    }
  }
 

}
