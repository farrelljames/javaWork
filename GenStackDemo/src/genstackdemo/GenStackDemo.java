/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genstackdemo;

/**
 *
 * @author jamesfarrell
 */
public class GenStackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer a[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(a);
        
        int iVal;
        
        
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
    }
    
}
