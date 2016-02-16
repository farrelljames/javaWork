/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterconvert;

/**
 *
 * @author jamesfarrell
 */
public class CharacterConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        
        char ch;
        int count = 0;
        
        for(;;) {
            System.out.println("Pleas enter some text");
            
            do {
                
                ch = (char) System.in.read();
                if(ch >= 65 & ch <= 90) {
                    ch += 32;
                    System.out.print(ch);
                    count++;
                } else if(ch >= 97 & ch <= 122) {
                    ch -= 32;
                    System.out.print(ch);
                    count++;
                } else {
                    System.out.print(ch);
                }
                
            } while(ch != '.');
            
            break;
        }
        
        System.out.println();
        System.out.println("There were " + count + " case changes");
    }
    
}
