/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whiledemo;

/**
 *
 * @author jamesfarrell
 */
public class WhileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double check = 1;
        
        do {
            double result = Math.pow(check, 2.0);
            System.out.println(check + " squared is " + result);
            check++;

        } while(check < 0);
    }
    
}
