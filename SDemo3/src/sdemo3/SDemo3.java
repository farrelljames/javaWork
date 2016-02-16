/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdemo3;

/**
 *
 * @author jamesfarrell
 */
public class SDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Hello james");
        
        System.out.println(StaticBlock.rootOf3);
    }
    
}

class StaticBlock {
    static double rootOf3;
    static double rootOf4;
    
    static {
        System.out.println("Inside static block");
        rootOf3 = Math.sqrt(3);
        rootOf4 = Math.sqrt(4);
    }
    
    StaticBlock(String msg) {
        System.out.println(msg);
    }
}
