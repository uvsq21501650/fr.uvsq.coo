/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.uvsq.groupe3.bowlinggame.Game;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mccstan
 */
public class BowlingGameTest extends TestCase {
    private Game g;
    
    /**
     *
     */
    public BowlingGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    @Override
    public void setUp() {
        g=new Game();
    }
    
      private void rollMany(int n, int pins)
      {
           for(int i=0; i<n;i++)
             g.roll(pins);
      }
    
    /**
     *
     */
    @After
    @Override
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
      @Test
      public void testGutterGame() throws Exception
      {
          rollMany(20, 0);
         assertEquals(0, g.score());
      }

      
      @Test
      public void testAllOnes () throws Exception
      {
          rollMany(20, 1);
          assertEquals(20, g.score());
      }
      @Test
      public void testOneSpare()
      {
          rollSapre();
          g.roll(3);
          rollMany(17, 0);
          assertEquals(16, g.score());
      }

    /**
     *
     */
      @Test
      public void testOneStike()
      {
          rollStike();
          g.roll(3);
          g.roll(4);
          rollMany(16, 0);
          assertEquals(24, g.score());
      }
      @Test
      public void testPerfectGame() throws Exception
      {
          rollMany(12, 10);
          assertEquals(300, g.score());
      }
      private void rollStike()
      {
          g.roll(10);
      }
      private void rollSapre()
      {
          g.roll(5);
          g.roll(5); // spare
      }
}
