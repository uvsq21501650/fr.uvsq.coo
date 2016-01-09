package fr.uvsq.coo.GROUPE3;

import fr.uvsq.coo.GROUPE3.Connection.ConnectionManager;
import java.io.IOException;
import jdk.nashorn.internal.objects.annotations.Setter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    App app;
    
    
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    @org.junit.Test
    public static void testApp() throws IOException, ClassNotFoundException
    {
        Groupe gr=App.lire("Fichier");
        assertEquals("BENTALEB", ((Personnel)gr.getElement(0)).getNom() );
    }
    
    @org.junit.Test
    public static void testConn() 
    {
        ConnectionManager.initDB();
        assertNotNull(ConnectionManager.con);
    }
    
    @Before
    public void SetUp()
    {
        app=new App();
    }
    
    
}
