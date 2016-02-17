/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prioritydemo;

/**
 *
 * @author jamesfarrell
 */
public class PriorityDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Priority mt1 = new Priority("High Prioirity");
        Priority mt2 = new Priority("Low Prioirity");
        
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);
        
        mt1.thrd.start();
        mt2.thrd.start();
        
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("\nHigh priority thread counted to " + mt1.count);
         System.out.println("\nLow priority thread counted to " + mt2.count);
        
    }
    
}

class Priority implements Runnable {
    int count;
    Thread thrd;
    static boolean stop = false;
    static String currentName;
    
    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }
    
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(stop == false && count < 10000000);
        stop = true;
        System.out.println(thrd.getName() + " terminating");
    }
}
