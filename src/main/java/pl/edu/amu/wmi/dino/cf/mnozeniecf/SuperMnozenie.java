/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.cf.mnozeniecf;

/**
 *
 * @author bikol
 */
public class SuperMnozenie {
    /**
     * Wylicza iloczyn dwóch liczb (dowolnych).
     * 
     * @param a
     * @param b
     * @return 
     */
    public static String mul(String a, String b){
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);  
        
        int value = aInt*bInt;
        
        return Integer.toString(value);
        
        
    }
    
}
