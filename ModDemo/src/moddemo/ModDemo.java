/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moddemo;

/**
 *
 * @author jamesfarrell
 */
public class ModDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int irem, iresult;
        double drem, dresult;
        
        iresult = 10 / 3;
        irem = 10 % 3;
        
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;
        
        System.out.println("Result and remainder of 10 / 3: " + iresult + " " + irem);
        System.out.println("Result and remainder of 10.0 / 3.0: " + dresult + " " + drem);
    }
    
}
