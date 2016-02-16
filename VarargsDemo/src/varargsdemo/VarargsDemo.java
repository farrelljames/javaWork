/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargsdemo;

/**
 *
 * @author jamesfarrell
 */
public class VarargsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum());
        System.out.println(sum(1,543,985,3222321,-1));
        System.out.println(sum(1.6,7.9,2.2));
    }
    
    static int sum(int ... v) {
        int sum = 0;
        if(v.length == 0)
            return 0;
        
        for(int i = 0; i < v.length; i++) sum += v[i];
        
        return sum;
    }
    
    static double sum(double ... v) {
        double sum = 0;
        if(v.length == 0)
            return 0;
        
        for(int i = 0; i < v.length; i++) sum += v[i];
        
        return sum;
    }

    
}
