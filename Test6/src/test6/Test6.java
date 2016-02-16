/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test6;

/**
 *
 * @author jamesfarrell
 */
public class Test6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Test ob1 = new Test(5);
        Test ob2 =  new Test(8);
        
        System.out.print("ob1 a: ");
        System.out.println(ob1.a);
        System.out.println();
        System.out.print("ob2 a: ");
        System.out.print(ob2.a);
        System.out.println();
        
        Test.swap(ob1, ob2);
        System.out.println();
        System.out.println("Swapped");
        System.out.print("ob1 a: ");
        System.out.println(ob1.a);
        System.out.println();
        System.out.print("ob2 a: ");
        System.out.print(ob2.a);
        System.out.println();
    }
    
    
}

class Test {
    int a;
    
    Test(int i) {
        a = i;
    }
    
    static void swap(Test ob1, Test ob2) {
        int x = ob1.a;
        ob1.a = ob2.a;
        ob2.a = x;
    }
}
