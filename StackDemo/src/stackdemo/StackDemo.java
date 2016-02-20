/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;

/**
 *
 * @author jamesfarrell
 */
public class StackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer a[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(a);
        
        Character b[] = new Character[10];
        GenQueue<Character> q1 = new GenQueue<>(b);
        
        int iVal;
        char cVal;
        
        System.out.println("Demonstrate a stack of Integers.");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.push(i);
            }
        } catch(QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        
        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Gettng next integer from q: ");
                iVal = q.pop();
                System.out.println(iVal);
            }
        } catch(QueueEmptyException exc) {
            System.out.println(exc);
        }
        
        System.out.println();
      
        System.out.println("Demonstrate a stack of characters.");
        try {
            for(int i=0; i < 15; i++) {
                System.out.println("Adding " + (char) ('a' + i) + " to q1.");
                q1.push((char) ('a' + i));
            }
        } catch(QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        
        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Gettng next character from q1: ");
                iVal = q1.pop();
                System.out.println((char) iVal);
            }
        } catch(QueueEmptyException exc) {
            System.out.println(exc);
        }
        
        
    }
    
    
    
}



