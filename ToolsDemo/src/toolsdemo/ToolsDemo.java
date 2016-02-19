/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolsdemo;

/**
 *
 * @author jamesfarrell
 */
public class ToolsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(Tools tool: Tools.values()) {
            System.out.println( tool + " is " + tool.ordinal());
        }
        
    }
    
    enum Tools {
        SCREWDRIVER, WRENCH, HAMMER, PLIERS
    }
    
}
