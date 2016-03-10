/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericfunctionalinterfacedemo;

/**
 *
 * @author jamesfarrell
 */
public class GenericFunctionalInterfaceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;
        
        if(isFactor.test(10,2))
            System.out.println("2 is a factor of 10");
        System.out.println();
        
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;
        
        if(isFactorD.test(212.0, 4.0))
            System.out.println("4.0 is a factor os 212.0");
        System.out.println();
        
        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;
        
        String str = "Generic Functional Interface";
        
        System.out.println("Testing string " + str);
        
        if(isIn.test(str, "face"))
            System.out.println("'face' is found.");
        else
            System.out.println("'face' not found.");
    }
    
}

interface SomeTest<T> {
    boolean test(T n, T m);
}
