/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsdemo;

/**
 *
 * @author jamesfarrell
 */
public class FSDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FailSoftArray fs =  new FailSoftArray(5, -1);
        int x;
        
        System.out.println("Fail quietly.");
        for(int i=0; i < (fs.length * 2); i++) {
            fs.put(i, i*10);
        }
        
        for(int i=0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
        }
        System.out.println("");
        
        System.out.println("\nFail with error reports.");
        for(int i=0; i < (fs.length * 2); i++) {
            if(!fs.put(i, i*10)) {
                System.out.println("Index " + i + " out-of-bounds");
            }
        }
        
        for(int i=0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
            else System.out.println("Index " + i + " out-of-bounds");
        }
        
    }
    
}

class FailSoftArray {
    private int a[];
    private int errval;
    public int length;
    
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }
    
    public int get(int index) {
        if(indexOK(index)) return a[index];
        return errval;
    }
    
    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }
    
    private boolean indexOK(int index) {
        if(index >= 0 & index < length) return true;
        return false;
    }
}
