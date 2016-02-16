/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyfile;
import java.io.*;

/**
 *
 * @author jamesfarrell
 */
public class CopyFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        
        if(args.length != 2) {
            System.out.println("Usage: CopyFile form to");
            return;
        }
        
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Erro Closing Input File");
            }
            try {
                if(fout != null) fout.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
    
}
