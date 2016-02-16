/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravity;

/**
 *
 * @author jamesfarrell
 */
public class Gravity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int moon, earth;
        
        earth = 345;
        moon = (earth * 17 / 100);
        
        System.out.println("you weigh on earth is " + earth);
        System.out.println("on the moon it is " + moon);
              
    }
    
}
