/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.GROUPE3.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author mccstan
 */
public class ConnectionManager 
{
    static String driver="org.apache.derby.jdbc.EmbeddedDriver";
    static String urlCreate="jdbc:derby:cooDB;create=true;";
    static String urlCon="jdbc:derby:cooDB;";
    public static Connection con;
    public static Statement statement;
    public static void initDB()     {
        
        try {
            Class.forName(driver).newInstance();
        } catch(Exception e)
        {
            
        }
        String querryCreatePersonnel=""
                + "CREATE TABLE Personnel("
                + " nom VARCHAR(30) NOT NULL PRIMARY KEY,"
                + " prenom VARCHAR(30) NOT NULL,"
                + " dateNaissance DATE,"
                + " numsTelephone VARCHAR(100),"
                + " fonctions VARCHAR(100),"
                + " idGroupe INTEGER"
                + ")";
        String querryCreateGroupe=""
                + "CREATE TABLE GROUPE("
                + " idGroupe INTEGER NOT NULL PRIMARY KEY,"
                + " idGroupeParent INTEGER,"
                + " description VARCHAR(20)"
                + ")";
        try
        {
            con=DriverManager.getConnection(urlCreate, "uvsq", "uvsq");
            statement=con.createStatement();
            statement.executeUpdate(querryCreatePersonnel);
            int state=statement.executeUpdate(querryCreateGroupe);
            System.out.println(" STAT :"+state);
            statement.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void createConnection()
    {
        try {
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(urlCon);
            statement=con.createStatement();
        } catch(Exception e)
        {
        }
        
    }
}
