/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqrroot;

/**
 *
 * @author jamesfarrell
 */
public class SqrRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, sroot, rerr;
        
        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            
            System.out.println("Square root of " + num +
                               " is " + sroot);
            
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
            
            int sum = 0;
            
            for(int i = 0; i < 10; sum += i++);
            
            System.out.print(sum);
        }
    }
    
}
