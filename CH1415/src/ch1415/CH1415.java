/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1415;

interface MyInterface {
    int myFunc();
}

public class CH1415 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyClass mcObj = new MyClass(18);
        
        MyInterface mi = mcObj::myInstMethod;
        
        System.out.println("18 + 10 = " + mi.myFunc());
        
    }
    
}

class MyClass {
    
    private int n;
    
    MyClass(int n) {
        this.n = n;
    }
    
    public int myInstMethod() {
        return n + 10;
    }
}
