/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.GROUPE3.DAO;

import fr.uvsq.coo.GROUPE3.Groupe;
import fr.uvsq.coo.GROUPE3.Personnel;
import java.security.acl.Group;

/**
 *
 * @author mccstan
 */
public class DAOFactory 
{
    public static DAO<Personnel> getPersonnelSerialDAO()
    {
        return new PersonnelSerialDAO();
    }
    public static DAO<Personnel> getPersonnelJDBCDAO()
    {
        return new PersonnelJDBCDAO();
    }
    
    public static DAO<Groupe> getGroupeSerialDAO()
    {
        return new GroupeSerialDAO();
    }
    
    public static DAO<Groupe> getGroupeJDBCDAO()
    {
        return new GroupeJDBCDAO();
    }
}
