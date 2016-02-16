/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encode;

/**
 *
 * @author jamesfarrell
 */
public class Encode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = "This is a secret message.";
        String encmsg = "";
        String decmsg = "";
        int key = 0;
        String test = "abcdefgh";
        
        for(int i = 0; i < test.length(); i++) {
            key += test.charAt(i);
        }
        
        System.out.println("Original Message: " + msg);
        System.out.println();
        
        for(int i = 0; i < msg.length(); i++) {
            encmsg += (char) (msg.charAt(i) ^ key);
        }
        
        System.out.println("Encoded Message: " + encmsg);
        System.out.println();
        
        for(int i = 0; i < msg.length(); i++) {
            decmsg += (char) (encmsg.charAt(i) ^ key);
        }
        
        System.out.println("Decoded Message: " + decmsg);
        System.out.println();
        
        
    }
    
}
