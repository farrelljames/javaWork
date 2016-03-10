/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch148;

interface MyFunc<T> {
    
    T func(T n);
}

public class CH148 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFunc<Integer> fi = (n) -> {
            int result = 1;
            
            for(int i = 1; i <= n; i++) result *= i;
            
            return result;
        };
        
        MyFunc<Double> di = (n) -> {
            double result = 1.0;
            
            for(double i = 1.0; i <= n; i++) result *= i;
            
            return result;
        };
        
        
        System.out.println("the factorial of 4 is " + fi.func(4));
        System.out.println("the factorial of 4 is " + fi.func(9));
        System.out.println("the factorial of 4 is " + fi.func(6));
        System.out.println("the factorial of 4 is " + di.func(4.7));
    }
    
}
