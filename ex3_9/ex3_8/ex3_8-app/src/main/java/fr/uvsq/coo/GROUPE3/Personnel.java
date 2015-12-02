/**
  *
  *@name Personne
  *
  */

package fr.uvsq.coo.GROUPE3;

import java.time.LocalDate;
import java.util.List;

public class Personnel
{
  private String nom;
  private Sting prenom;
  private LocalDate dateNaissance;
  private List<String> numsTelephone;
  private String fonction;


  public class builder
  {
    //Params requis
    private String nom;
    private Sting prenom;

    //params optionnels
    private LocalDate dateNaissance="0000-00-00";
    private List<String> numsTelephone=new List<String>();
    private String fonction="Non défini";

    public 

    public Builder(Sting nom, String prenom)
    {
        this.nom=nom;
        this.prenom=prenom;
    }

    public Builder localDate(LocalDate dateNaissance)
    {
      this.dateNaissance=dateNaissance;
      return this;
    }

    public Builder localDate(List<String> numsTelephone)
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
