/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalize;

/**
 *
 * @author jamesfarrell
 */
public class Finalize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count;
        
        FDemo ob = new FDemo(0);
        
        for(count=1; count < 1000000; count++) {
            ob.generator(count);
        }
    }
    
}

class FDemo {
    int x;
    
    FDemo(int i) {
        x = i;
    }
    
    protected void finalize() {
        System.out.println("Finalising " + x);
    }
    
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
