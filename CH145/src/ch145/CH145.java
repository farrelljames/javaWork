/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch145;


interface MyInterface {
    boolean test(int n);
}


public class CH145 {

    
    public static void main(String[] args) {
        
        MyInterface mi = (n) -> n >= 10 & n <= 20;
        
        System.out.println("is 17 in between 10 and 20 " + mi.test(17));
        System.out.println("is 100 in between 10 and 20 " + mi.test(100));
        System.out.println("is -4 in between 10 and 20 " + mi.test(-4));
        System.out.println("is 10 in between 10 and 20 " + mi.test(10));
        System.out.println("is 20 in between 10 and 20 " + mi.test(20));
        
    }
    
}
