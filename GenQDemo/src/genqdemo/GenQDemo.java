/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genqdemo;

/**
 *
 * @author jamesfarrell
 */
public class GenQDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);
        
        Integer iVal;
        
        System.out.println("Demonstrate a queue of Integers.");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i);
            }
        } catch(QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        
        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Gettng next integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch(QueueEmptyException exc) {
            System.out.println(exc);
        }
        
        System.out.println();
        
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);
        
        Double dVal;
        
        System.out.println("Demonstrate a queue of Doubles.");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + (double) i / 2 + " to q2.");
                q2.put((double) i/2);
            }
        } catch(QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        
        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Gettng next integer from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch(QueueEmptyException exc) {
            System.out.println(exc);
        }
       
        Character cStore[] = new Character[10];
        GenQueue<Character> q3 = new GenQueue<Character>(cStore);
        
        Character cVal;
        
        System.out.println();
        
        System.out.println("Demonstrate a queue of chars.");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + (char) ('a' + i) + " to q3.");
                q3.put((char) ('a' + i));
            }
        } catch(QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        
        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Gettng next character from q3: ");
                cVal = q3.get();
                System.out.println(cVal);
            }
        } catch(QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
    
}
