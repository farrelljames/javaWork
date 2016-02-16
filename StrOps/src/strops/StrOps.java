/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strops;

/**
 *
 * @author jamesfarrell
 */
public class StrOps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful.";
        int result, idx;
        char ch;
        
        System.out.println("Length of str1: " + str1.length());
        
        for(int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        
        if(str1.equals(str2)){
            System.out.println("str1 equals str2");
        } else {
            System.out.println("str1 doesn't equals str2");
        }
        
        if(str1.equals(str3)){
            System.out.println("str1 equals str3");
        } else {
            System.out.println("str1 doesn't equals str3");
        }
        
        result = str1.compareTo(str3);
        if(result == 0) {
            System.out.println("str1 and str3 are equal");
        } else if(result < 0) {
            System.out.println("str1 is less than str3");
        } else {
            System.out.println("str1 is more than str3");
        }
        
        str2 = "One Two Three One";
        
        idx = str2.indexOf("One");
        System.out.println("Index of first occurence of One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of last occurence of One: " + idx);
        
    }
    
}
