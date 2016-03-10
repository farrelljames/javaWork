/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodrefdemo;

/**
 *
 * @author jamesfarrell
 */
public class MethodRefDemo {

    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }
    
    public static void main(String[] args) {
        
        boolean result;
        
        result = numTest(MyIntPredicates::isPrime, 17);
        if(result) System.out.println("17 is prime");
        
        result = numTest(MyIntPredicates::isEven, 12);
        if(result) System.out.println("12 is even");
        
        result = numTest(MyIntPredicates::isPositive, 11);
        if(result) System.out.println("11 is positive");
    }
    
}

interface IntPredicate {
    boolean test(int n);
}

class MyIntPredicates {
    
    static boolean isPrime(int n) {
        if(n < 2) return false;
        
        for(int i = 2; i < n/i; i++) {
            if(n % i == 0)
                return false;
        }
        
        return true;
    }
    
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    static boolean isPositive(int n) {
        return n > 0;
    }
    
}
