/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icharq;
import qpack.*;
/**
 *
 * @author jamesfarrell
 */
public class IQDemo {
    public static void main(String args[]) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        
        ICharQ iQ;
        
        char ch;
        int i;
        
        iQ = q1;
        
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        
        System.out.print("Contents of fixed queue: ");
        for(i=0;i<10;i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        
        iQ = q2;
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }
        
        System.out.print("Contents of dynamic queue: ");
        for(i=0;i<10;i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        
        iQ = q3;
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        
        System.out.print("Contents of circular queue: ");
        for(i=0;i<10;i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        
        for(i = 10; i < 20; i++) {
            iQ.put((char) ('A' + i));
        }
        
        System.out.print("Contents of ciruclar queue: ");
        for(i=0;i<10;i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nStore and consume from" + " circular queue.");
        
        for(i=0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        System.out.println(iQ.reset());
        
    }
}


