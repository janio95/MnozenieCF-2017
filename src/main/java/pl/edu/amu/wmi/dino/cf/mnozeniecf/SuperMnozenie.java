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
        
        String aa = a;
        String bb = b;
        
        if (aa.contains(".") || bb.contains("."))
        {
            
            float aFloat = Float.parseFloat(a);
            float bFloat = Float.parseFloat(b);
            float value = aFloat*bFloat;
            
            return Float.toString(value);
        }
        
        else 
        {
        long aLong = Long.parseLong(a);
        long bLong = Long.parseLong(b);  
        
        long value = aLong*bLong;
        return Long.toString(value);
        }
        
        
        
        
    }
    
}