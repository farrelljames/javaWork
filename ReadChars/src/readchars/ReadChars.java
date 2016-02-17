/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readchars;
import java.io.*;

/**
 *
 * @author jamesfarrell
 */
public class ReadChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       char c;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter characters, full stop to quit");
       
       do {
           c = (char) br.read();
           System.out.println(c);
       } while( c != '.');
    }
    
}
