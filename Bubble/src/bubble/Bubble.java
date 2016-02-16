/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble;

/**
 *
 * @author jamesfarrell
 */
public class Bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[] = {1,5,9,3-4,8373,76738,-3093,76};
        String words[] = {"hello", "zzzzzzzzzzzzz", "my", "name", "is", "james", "jaijaaamakm", "z"};
        
        for(int i = 0; i < nums.length; i ++) System.out.print(words[i] + " ");
        
        for(int x = 1; x < words.length; x++) {
            for(int y = words.length - 1; y >= x; y--) {
                if(words[y-1].compareTo(words[y]) > 0) {
                    String t = words[y-1];
                    words[y-1] = words[y];
                    words[y] = t;
                }
            }
        }
        System.out.println();
        
        for(int i = 0; i < words.length; i ++) System.out.print(words[i] + " ");
        
    }
    
}
