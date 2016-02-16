/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substr;

/**
 *
 * @author jamesfarrell
 */
public class SubStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sen = "Hello my name is James";
        
        String substring = sen.substring(7, 12);
        
        System.out.println(sen);
        System.out.println(substring);
    }
    
}
