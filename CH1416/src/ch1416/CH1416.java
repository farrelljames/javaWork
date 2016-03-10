/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1416;

interface IntPredicate {
    boolean test(int n);
}


class MyIntNum {
    private int v;
    
    MyIntNum(int x) { v = x; }
    
    int getNum() { return v; }
    
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
    
    boolean hasCommonFactor(int n) {
        
        int count = 0;
        int c = 0;
        
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                c++;   
            }
        }
        
        int cf[] = new int[c];
        
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                cf[count++] = i;   
            }
        }
       

        for(int i = 0; i < cf.length-1; i++) {
            if(cf.length > 0) {
                if(v % cf[i] == 0) return true;
            }
        }
        
        
        return false;
    }
}

public class CH1416 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean result;
        
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        MyIntNum myNum3 = new MyIntNum(9);
        
        IntPredicate ip = myNum::isFactor;
        
        result = ip.test(3);
        if(result) System.out.println("3 is a factor of " + myNum.getNum());
        
        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result) System.out.println("3 is not a factor of " + myNum2.getNum());
        
        ip = myNum3::hasCommonFactor;
        result = ip.test(12);
        if(result) System.out.println("9 and 12 do share a common factor");
    }
    
}
