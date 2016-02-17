/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch103;
import java.io.*;

/**
 *
 * @author jamesfarrell
 */
public class Ch103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        
        if(args.length != 2) {
            System.out.println("Usage: java C103 <file> <file>");
            return;
        }
        
        try(FileReader fin = new FileReader(args[0]);
            FileWriter fout = new FileWriter(args[1])) {
            
            do {
                i = fin.read();
                if(i != -1) {
                    if(i == ' ')
                        i = '-';
                    fout.write(i);
                }
            } while(i != -1);
            
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
    
}
