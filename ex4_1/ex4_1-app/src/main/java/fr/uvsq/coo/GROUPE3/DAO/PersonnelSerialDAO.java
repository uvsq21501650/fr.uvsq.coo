/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.GROUPE3.DAO;

import fr.uvsq.coo.GROUPE3.Personnel;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mccstan
 */
public class PersonnelSerialDAO extends DAO<Personnel>{

    @Override
    public Personnel create(Personnel obj) {
        try(ObjectOutputStream out=new ObjectOutputStream(
                                                            new  BufferedOutputStream(
                                                                    new FileOutputStream("FichierPersonnel"))))
        {
            out.writeObject(obj);
        } catch (IOException ex) {
            Logger.getLogger(PersonnelSerialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return  obj;
    }

    @Override
    public Personnel find(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personnel update(Personnel obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Personnel obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
