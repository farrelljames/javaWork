/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

/**
 *
 * @author jamesfarrell
 */
public class Phone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numbers[][] = {
            {"Tom", "555-5555"},
            {"James", "535-7487"},
            {"Meg", "655-7484"},
            {"April", "747-5335"},
        };
        
        int i;
        
        if(args.length > 0) {
            for(i = 0; i < numbers.length; i++) {
                if(args[0].equals(numbers[i][0])) {
                    System.out.println(numbers[i][0] + " : " + numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length) System.out.println("Name not found");
        } else {
            System.out.println("Usage: java Phone <name>");
        }
    }
    
}
