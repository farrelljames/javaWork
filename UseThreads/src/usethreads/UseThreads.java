/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usethreads;
import java.io.*;
/**
 *
 * @author jamesfarrell
 */
public class UseThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        
        MyThread mt = new MyThread("Child #1");
        Thread newThrd = new Thread(mt);
        newThrd.start();
        
        for(int i=0; i<50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread ending");
    
}
}

class MyThread implements Runnable {
    String thrdName;
    
    MyThread(String name) {
        thrdName = name;
    }
    
    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrdName + " interupted.");
        }
        System.out.println(thrdName + " terminating");
    }
}
