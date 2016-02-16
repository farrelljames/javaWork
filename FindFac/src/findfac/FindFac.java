/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findfac;

/**
 *
 * @author jamesfarrell
 */
public class FindFac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        for(int i = 2; i < 100; i++) {
            System.out.print("Factors of " + i + ": ");
            
            FindFac ff = new FindFac();
            
            if(ff.isPrime(i)) {
                for(int x = 2; x < i; x++) {
                    if(i % x == 0) System.out.print(x + " ");
                }  
            }
            
            System.out.println();
        }
    }
    
    public boolean isPrime(int number) {
        
        boolean check = false;
        
        for(int i = 1; i < number; i++) {
            if(i != 1) {
                if(number % i == 0) {
                    check = true;
                    break;
                }
            }
        }
        
        return check;
    }

}
