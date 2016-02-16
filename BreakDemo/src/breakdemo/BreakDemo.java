/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakdemo;

/**
 *
 * @author jamesfarrell
 */
public class BreakDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i = 0; i < 5; i++)
            done: {
                for(int y = 0; y < 5; y++) {
                    if(y == 2) break done;
                    System.out.println("x  and y: " + i + " " + y);
                }
            }
        
        
    }
    
}
