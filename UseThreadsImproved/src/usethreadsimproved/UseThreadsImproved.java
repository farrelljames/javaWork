/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usethreadsimproved;
/**
 *
 * @author jamesfarrell
 */
public class UseThreadsImproved {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        
        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");
        
        try {
            mt1.thrd.join();
            System.out.println(mt1.thrd.getName());
            mt2.thrd.join();
            System.out.println(mt2.thrd.getName());
            mt3.thrd.join();
            System.out.println(mt3.thrd.getName());
        } catch(InterruptedException exc) {
            System.out.println("Mian thread interrupted");
        }
        
        System.out.println("Main thread ending");
    }
    
}

class MyThread implements Runnable {
    Thread thrd;
    
    MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }
    
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interupted.");
        }
        System.out.println(thrd.getName() + " terminating");
    }
}
