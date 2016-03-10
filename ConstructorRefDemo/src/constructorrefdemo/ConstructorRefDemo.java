/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorrefdemo;


interface MyFunc {
    MyClass func(String s);
}

class MyClass {
    private String str;
    
    MyClass(String s) { str = s; }
    
    MyClass() { str = ""; }
    
    String getStr() { return str; }
}


public class ConstructorRefDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyFunc myClassCons = MyClass::new;
        
        MyClass mc = myClassCons.func("Testing");
        
        System.out.println("str in mc is " + mc.getStr());
    }
    
}
