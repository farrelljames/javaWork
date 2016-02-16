/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qexcdemo;

/**
 *
 * @author jamesfarrell
 */
public class QExcDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;
        
        try {
            for(i=0; i < 11; i++) {
                System.out.print("Attempting to store :" + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        
        try {
            for(i=0;i<11;i++) {
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch(QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
    
}
