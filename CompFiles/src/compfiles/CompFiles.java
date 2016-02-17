/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compfiles;
import java.io.*;

/**
 *
 * @author jamesfarrell
 */
public class CompFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0, j=0, c=0;
        
        if(args.length != 2) {
            System.out.println("Usage: java CompFiles <file> <file2>");
            return;
        }
        
        try(FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1])) {
            
            do {
                i = f1.read();
                j = f2.read();
                c++;
                if(i != j) break;
            } while(i != -1 && j != -1);
            
            if(i != j) {
                System.out.println("Files differ on position: " + c);
            } else {
                System.out.println("Files are the same");
            }
            
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
    
}
