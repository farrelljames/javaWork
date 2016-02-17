/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;
import java.io.*;
/**
 *
 * @author jamesfarrell
 */
public class DtoS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        
        try(BufferedReader br = new BufferedReader( new FileReader("test.txt"))) {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
              System.out.println("I/O Error: " + exc);
        }
    }
    
}
