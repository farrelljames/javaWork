/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showbits;

/**
 *
 * @author jamesfarrell
 */
public class ShowBits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int t, val;
        
        val = 232;
        
        for(t = 256; t > 0; t /= 2) {
            if((val & t) != 0) System.out.print(" 1");
            else System.out.print(" 0");
        }
    }
    
}
