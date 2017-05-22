/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.cf.mnozeniecf;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bikol
 */
public class SuperMnozenieTest {

    public SuperMnozenieTest() {
    }

    @Test
    public void testMul() {
        assertEquals("1", SuperMnozenie.mul("1", "1"));
    }

    /**
     * Patryk Żywica
     */
    @Test
    public void testMul1() {
        assertEquals("0", SuperMnozenie.mul("1", "0"));
    }

    @Test
    public void testMul2() {
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            int r = rand.nextInt();
            assertEquals("0", SuperMnozenie.mul("0", Integer.toString(r)));
            assertEquals("0", SuperMnozenie.mul(Integer.toString(r), "0"));
        }
    }

    @Test
    public void testMul3() {
        assertEquals("-1", SuperMnozenie.mul("1", "-1"));
    }
    
     /**
     * Maciej Wanat
     */
    
    @Test
    public void testMul4() {       
        assertEquals("1000000000000", SuperMnozenie.mul("1000000", "1000000"));      
    }
    
    @Test
    public void testMul5() {       
        assertEquals("1.5", SuperMnozenie.mul("1.5", "1"));      
    }
    
    @Test 
    public void testMul6() {       
        assertEquals("-1.5", SuperMnozenie.mul("-1.5", "1"));      
    }
    
}
