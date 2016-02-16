/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiontest;

/**
 *
 * @author jamesfarrell
 */
public class RecursionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str = "Hello my name is James.";
        recursion(str, str.length() - 1);

    }
    
    static void recursion(String str, int index) {
        if(index == 0) {
            System.out.print(str.charAt(index));
            System.out.println();
            return;
        }
        System.out.print(str.charAt(index));
        recursion(str, index-1);
    }
    
}
