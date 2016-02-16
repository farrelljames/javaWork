/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qdemo2;

/**
 *
 * @author jamesfarrell
 */
public class QDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char list[] = {'a','y','j','f','m','h'};
        
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        Queue q3 = new Queue(bigQ);
        Queue q4 = new Queue(list);
        
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
        
        System.out.println();
        
        for(i = 0; i < 26; i++) {
            q3.put((char) ('a' + i));
        }
        
        System.out.print("Contents of q3: ");
        for(i=0;i<26;i++) {
            ch = q3.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        
        System.out.println();
        
         System.out.print("Contents of q3: ");
        for(i=0;i<list.length;i++) {
            ch = q4.get();
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
    
    Queue(Queue ob) {
        q = new char[ob.q.length];
        putloc = ob.putloc;
        getloc = ob.getloc;
        
        for(int i = getloc; i < putloc; i++) {
            q[i] = ob.q[i];
        }
    }
    
    Queue(char a[]) {
        q = new char[a.length];
        putloc = 0;
        getloc = 0;
        
        for(int i = 0; i < q.length; i++) put(a[i]);
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
