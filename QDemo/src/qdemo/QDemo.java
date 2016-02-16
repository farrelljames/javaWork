/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qdemo;

/**
 *
 * @author jamesfarrell
 */
public class QDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        
        System.out.println("Using bigQ to store the alphabet.");
        for(i=0;i<26;i++) {
            bigQ.put((char) ('A' + i));
        }
        
        
        
        System.out.print("Contents of bigQ: ");
        for(i=0;i<26;i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.println("Using smallQ to generate errors");
        for(i=0;i<5;i++){
            System.out.print("Attempting to store " + (char) ('Z' - i));
            
            smallQ.put((char) ('Z' - i));
            
            System.out.println();
        }
        System.out.println();
        
        System.out.print("Contents of smallQ: ");
        for(i=0;i<5;i++) {
            ch = smallQ.get();
            
            if(ch != (char) 0) System.out.print(ch);
        }
        
        
        
    }
    
}

class Queue {
    private char q[];
    private int putloc, getloc;
    
    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
        
    }
    
    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }
    
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
