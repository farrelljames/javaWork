/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varcapture;

/**
 *
 * @author jamesfarrell
 */
public class VarCapture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 10;
        
        MyFunc myLambda = (n) -> {
            int v = num + n;
            
            return v;
        };
        
        System.out.println(myLambda.func(8));
    }
    
}

interface MyFunc {
    int func(int n);
}
