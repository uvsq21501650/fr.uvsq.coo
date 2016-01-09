package fr.uvsq.coo.GROUPE3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Groupe  implements Element, Serializable
{
    private int idGroupe;
    private int idGroupeParent;
    private String description;
    private List<Element> listeElements;

    public Groupe(int idGroupe, int idGroupeParent, String description) {
        this.idGroupe=idGroupe;
        this.idGroupeParent=idGroupeParent;
        this.description=description;
        listeElements=new ArrayList<>();
    }
    
    


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Element> getListeElements() {
        return listeElements;
    }

    public void setListeElements(List<Element> listeElements) {
        this.listeElements = listeElements;
    }
    
    public void addElement(Element element)
    {
        listeElements.add(element);
    }
    public Element getElement(int position)
    {
        return listeElements.get(position);
    }

    

}