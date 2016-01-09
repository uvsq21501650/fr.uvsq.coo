package fr.uvsq.coo.GROUPE3;

import fr.uvsq.coo.GROUPE3.Connection.ConnectionManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import org.apache.derby.iapi.reference.ClassName;

/**
 * Hello world!
 *
 */
public class App 
{
    static Groupe gr;
    public static void main( String[] args ) throws IOException, SQLException
    {
        ConnectionManager.initDB();
        ConnectionManager.createConnection();
        ResultSet rs=ConnectionManager.statement.executeQuery("select * from Personnel");
        rs.next();
        System.out.println(rs.getMetaData());
        
        
        
        
        
        /*Personnel p=new Personnel
                .Builder("BENTALEB", "Meriem")
                .localDate(LocalDate.of(2015, Month.AUGUST, 28))
                .build();
        
        Groupe gr=new Groupe(0,0,"Administrateurs");
        gr.addElement(p);
        ecrire(gr, "Fichier");*/
        
    }
    
    public static void ecrire(Groupe gr, String filename) throws IOException
    {
        try(ObjectOutputStream out=new ObjectOutputStream(
                                                            new  BufferedOutputStream(
                                                                    new FileOutputStream(filename))))
        {
            out.writeObject(gr);
        }
    }
    public  static Groupe lire(String filename) throws IOException, ClassNotFoundException
    {
        Groupe gr;
        try(ObjectInputStream in=new ObjectInputStream(
                                                            new  BufferedInputStream(
                                                                    new FileInputStream(filename))))
        {
            try
            {
                gr=(Groupe)in.readObject() ;
            }catch(EOFException e){throw  new  EOFException("LE fichier est vide");}
        }
        return gr;
    }
    
}
