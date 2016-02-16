/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchestometers;

/**
 *
 * @author jamesfarrell
 */
public class InchesToMeters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double inches, meters;
        int count = 0;
        
        for(meters = 1; meters < 144; meters++) {
            inches = meters * 39.37;
            System.out.println(meters + "meter is equal to " + inches + " inches");
            count++;
            
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
    
}
