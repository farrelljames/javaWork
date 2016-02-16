/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaloptable;

/**
 *
 * @author jamesfarrell
 */
public class LogicalOPTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p, q;
        
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        
        p = 1; q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (p == 0 ? 1 : 0));
        
        p = 1; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (p == 0 ? 1 : 0));
        
        p = 0; q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (p == 0 ? 1 : 0));
        
        p = 0; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (p == 0 ? 1 : 0));
    }
    
}
