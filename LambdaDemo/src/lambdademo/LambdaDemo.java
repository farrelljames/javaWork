/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdademo;

/**
 *
 * @author jamesfarrell
 */

interface MyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}

public class LambdaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyValue myVal;
        
        myVal = () -> 98.6;
        
        System.out.println("A constant value: " + myVal.getValue());
        
        MyParamValue myPval = (n) -> 1.0 / n;
        
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));
        
        myPval = (n) -> {
            double total = 0;
            
            for(int i = 1; i <= n; i++) total += i;
            
            return total;
        };
        
        System.out.println(myPval.getValue(5.0));
        
    }
    
}
