/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaargumentdemo;

/**
 *
 * @author jamesfarrell
 */
public class LambdaArgumentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inStr = "Lambda Expressions Expand Java";
        String outStr;
        
        System.out.println("Here is input string: " + inStr);
        
        StringFunc reverse = (str) -> {
            String result = "";
            
            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            
            return result;
        };
        
        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);
        
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaces: " + outStr);
        
        StringFunc invert = (str) -> {
            String result = "";
            char ch;
            
            for(int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            
            return result;
        };
        
        outStr = changeStr(invert, inStr);
        System.out.println("The string in inverted case is: " + outStr);
        
        StringFunc cypher = (str) -> {
            String result = "";
            
            for(int i = 0; i < str.length(); i++)
                result += (char) (str.charAt(i) + 300);
            
            return result;
        };
        
        outStr = changeStr(cypher, inStr);
        System.out.println("The string in encoded is: " + outStr);
        
        StringFunc removeSpaces = (str) -> {
            String result = "";
            
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != ' ') result += str.charAt(i);
            }
            
            return result;
        };
        
        outStr = changeStr(removeSpaces, inStr);
        System.out.println("The string with no spaces is: " + outStr);
    }
    
    
    
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }
    
    
    
}

interface StringFunc {
    String func(String str);
}