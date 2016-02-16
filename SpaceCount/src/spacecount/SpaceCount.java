/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacecount;

/**
 *
 * @author jamesfarrell
 */
public class SpaceCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        
        char ch, ignore;
        int count = 0;
        
        for(;;) {
            
            System.out.println("Type something: ");

            do {
                
                ch = (char) System.in.read();
                if(ch == ' ') count++;
                
            } while(ch != '.');
            
            break;
                    
        }
        System.out.println();
        System.out.println("You typed " + count + " spaces");
    }
    
}
