/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

/**
 *
 * @author jamesfarrell
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numbers[] = {15.0,76.9,987.2,7654.2,87.5,355.9,765.3,86.8,53.3,76.8};
        double sum = 0;
        
        for(double n: numbers) {
            sum += n;
        }
        
        System.out.println(sum / numbers.length);
        
    }
    
}
