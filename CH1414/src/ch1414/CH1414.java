/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1414;


interface MyInterface {
    int myFunc(int n);
}

public class CH1414 {

    
    public static void main(String[] args) {
        
        MyInterface mf = MyClass::myStaticMethod;
        
        System.out.println("6 + 10 = " + mf.myFunc(6));
        
    }
    
}

class MyClass {
    
    public static int myStaticMethod(int n) {
        return n + 10;
    }
}
