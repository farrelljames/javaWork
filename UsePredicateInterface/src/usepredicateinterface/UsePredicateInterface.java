/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usepredicateinterface;
import java.util.function.Predicate;
import java.util.function.BinaryOperator;
/**
 *
 * @author jamesfarrell
 */
public class UsePredicateInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Predicate<Integer> isEven = (n) -> (n % 2) == 0;
        
        if(isEven.test(4)) System.out.println("4 is even");
        
        if(!isEven.test(5)) System.out.println("5 is odd");
        
        BinaryOperator<Integer> add = (x, y) -> x + y;
        
        System.out.println("5 + 4 = " + add.apply(5,4));
    }
    
}
