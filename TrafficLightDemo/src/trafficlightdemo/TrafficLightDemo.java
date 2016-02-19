/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficlightdemo;

/**
 *
 * @author jamesfarrell
 */
public class TrafficLightDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
        
        for(int i=0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
    
}

enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);
    
    private int delay;
    
    TrafficLightColor(int d) {
        delay = d;
    }
    
    int getDelay() { return delay; }
    
    TrafficLightColor nextColor(int i) {
        if(i == 0)
            return GREEN;
        else if(i == 1)
            return YELLOW;
        else
            return RED;
    }
}

class TrafficLightSimulator implements Runnable {
    private Thread thrd;
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;
    
    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
        thrd = new Thread(this);
        thrd.start();
    }
    
    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
        thrd = new Thread(this);
        thrd.start();
    }
    
    public void run() {
        while(!stop) {
            try {
                switch (tlc) {
                    case GREEN:
                        Thread.sleep(TrafficLightColor.GREEN.getDelay());
                        break;
                    case YELLOW:
                        Thread.sleep(TrafficLightColor.YELLOW.getDelay());
                        break;
                    case RED:
                        Thread.sleep(TrafficLightColor.RED.getDelay());
                        break;
                }
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }
    
    synchronized void changeColor() {
        
        tlc = TrafficLightColor.GREEN.nextColor(tlc.ordinal());
       
        changed = true;
        notify();
    }
    
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait();
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }
    
    synchronized TrafficLightColor getColor() {
        return tlc;
    }
    
    synchronized void cancel() {
        stop = true;
    }
}
