/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowercase;

/**
 *
 * @author jamesfarrell
 */
public class LowerCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char ch;
        
        for(int i=0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            
            ch = (char) ((int) ch | 32);
            
            System.out.print(ch + " ");
        }
        
        int x, y;
        x = 12;
        y = 15;
        
        int r1 = x ^ y;
        int r2 = r1 ^ y;
        
        System.out.println(r1);
        System.out.println();
        System.out.println();
    }
    
}
