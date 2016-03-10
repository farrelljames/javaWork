/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch147;

interface NumericFunc {
    int test(int n);
}


public class CH147 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumericFunc fi = (n) -> {
            int result = 1;
            
            for(int i = 1; i <= n; i++) result *= i;
            
            return result;
        };
        
        System.out.println("the factorial of 4 is " + fi.test(4));
        System.out.println("the factorial of 4 is " + fi.test(9));
        System.out.println("the factorial of 4 is " + fi.test(6));
    }
    
}
