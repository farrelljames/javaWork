/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author jamesfarrell
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyValue myVal = (n) -> n * 10;
        
        System.out.println(myVal.getValue(4.59));
        
    }
    
}

interface MyValue {
    double getValue(double n);
}
