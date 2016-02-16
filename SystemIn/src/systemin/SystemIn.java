/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemin;

import java.io.IOException;

/**
 *
 * @author jamesfarrell
 */
public class SystemIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String food = "prawn";
        
        switch(food) {
            case "prawn":
                System.out.println("That is prawn");
                break;
            case "beef":
                System.out.println("That is beef");
                break;
            case "Chicken":
                System.out.println("That is chicken");
                break;
            default:
                System.out.println("Not on menu");
        }
        
    }
    
}
