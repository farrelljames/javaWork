/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmax;

/**
 *
 * @author jamesfarrell
 */
public class MinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {1,5,3,2,6,432,-8,2,1,12,136543};
        int min, max;
        
        min = max = numbers[0];
        
        for(int n: numbers) {
            if(n > max) max = n;
            if(n < min) min = n;
        }
        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
      
    }
    
}
