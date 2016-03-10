/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodrefdemo3;

interface MyIntNumPredicate {
    boolean test(MyIntNum mv, int n);
}

class MyIntNum {
    private int v;
    
    MyIntNum(int x) { v = x; }
    
    int getNum() { return v; }
    
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

public class MethodRefDemo3 {

    public static void main(String[] args) {
        
        boolean result;
        
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        
        MyIntNumPredicate inp = MyIntNum::isFactor;
        
        result = inp.test(myNum, 3);
        if(result)
            System.out.println("3 is a factor of " + myNum.getNum());
        
        result = inp.test(myNum2, 3);
        if(!result)
            System.out.println("3 is not a factor of " + myNum2.getNum());
    }
    
}
