/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author jamesfarrell
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyClass ob = new MyClass(15, 20);
       
       
       System.out.println("ob.a and ob.b before call: " +
                          ob.a + " " + ob.b);
       
       ob.change(ob);
       
       System.out.println("ob.a and ob.b after call: " +
                          ob.a + " " + ob.b);
       
    }
    
}

class MyClass {
    
    int a, b;
    
    MyClass(int i, int j) {
        a = i;
        b = j;
    }
    
    void change(MyClass ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
