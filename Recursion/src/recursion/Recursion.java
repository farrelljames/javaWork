/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author jamesfarrell
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factorial x = new Factorial();
        
        System.out.println(x.factR(5));
    }
    
}

class Factorial {
    
    int factR(int n) {
        int result;
        System.out.println(n);
        if(n==1) return 1;
        
        result = factR(n-1) * n;

        return result;
    }
}
