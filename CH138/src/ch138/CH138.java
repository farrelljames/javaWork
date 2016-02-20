/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch138;

/**
 *
 * @author jamesfarrell
 */
public class CH138 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double dVal = 12.89;
        MyGen<Double> ob1 = new MyGen<>(dVal);
        
        System.out.println(ob1.getValue());
        System.out.println(ob1.getClass());
    }
    
}

class MyGen<T> {
    private T a ;
    
    MyGen(T ob) {
        a = ob;
    }
    
    public T getValue() {
        return a;
    }
}
