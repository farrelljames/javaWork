/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writefile;
import java.io.*;

/**
 *
 * @author jamesfarrell
 */
public class WriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        
        if(args.length != 2) {
            System.out.println("Usage: java WriteFile <filename> <filename>");
            return;
        }
        
        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) {
            
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
        
        System.out.println("File copied");
    }
    
}
