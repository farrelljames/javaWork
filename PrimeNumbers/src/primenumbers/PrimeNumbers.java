/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

/**
 *
 * @author jamesfarrell
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int count = 2; count < 101; count++) {
            int y = 0;
            for(int x = 1; x <= count; x++) {
                if (count % x == 0) {
                    y++;
                }
            }
            System.out.println(y == 2 ? count + " is prime" : count + " is not prime");
            
        }
        
    }
    
}
