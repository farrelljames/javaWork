/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass.demo;

/**
 *
 * @author jamesfarrell
 */
public class MyClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Number x = 5;
        Double y = 14.65;
        
        MyClass<Number, Double> ob = new MyClass<>(x, y);
        
        ob.getName();
        System.out.println(ob.b.getClass());
    }
    
}

interface IGenIF<T, V extends T> {
    void getName();
}

class MyClass<T, V extends T> implements IGenIF<T, V> {
    T a;
    V b;
    
    MyClass(T a, V b) {
        this.a = a;
        this.b = b;
    }
    
    public void getName() {
        System.out.println(b);
    }
}
