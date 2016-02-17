/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10.pkg3;
import java.io.*;
/**
 *
 * @author jamesfarrell
 */
public class C103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        
        if(args.length != 1) {
            System.out.println("Usage: java C103 <file>");
            return;
        }
        
        try(FileInputStream fin = new FileInputStream(args[0])) {
            
            do {
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            } while(i != -1);
            
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
    
}
