/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usemain;

/**
 *
 * @author jamesfarrell
 */
public class UseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thrd;
        
        thrd = Thread.currentThread();
        
        System.out.println("Main thread is called: " + thrd.getName());
        
        System.out.println("Priority: " + thrd.getPriority());
        
        System.out.println();
        
        System.out.println("Setting name and priority.\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);
        
        System.out.println("Main thread is now called: " + thrd.getName());
        
        System.out.println("Priority: " + thrd.getPriority());
    }
    
}
