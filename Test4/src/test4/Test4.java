/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

/**
 *
 * @author jamesfarrell
 */
public class Test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Numbers n = new Numbers();
        byte ch = 7;
        
        System.out.println(n.factorial(4));
        
        System.out.println(n.factorial(4.0));
        
        System.out.println(n.factorial(4.0F));
         
        System.out.println(n.factorial(ch));
        
        
        
    }
    
}

class Numbers {
    
    
    int factorial(int n) {
        int sum = 1;
        for(int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
    
    double factorial(double n) {
        int sum = 1;
        for(int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
    
    
    
}
