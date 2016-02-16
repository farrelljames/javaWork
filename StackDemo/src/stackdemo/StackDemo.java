/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;

/**
 *
 * @author jamesfarrell
 */
public class StackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char list[] = {'a', 'z', 'j', 'p', 'w'};
        
        Stack ob = new Stack(26);
        Stack ob2 = new Stack(ob);
        Stack ob3 = new Stack(list);
        char ch;
        
        System.out.println("Putting contents in");
        for(int i = 0; i < 26; i++) {
            ob.push((char) ('a' + i));
            System.out.print((char) ('a' + i));
        }
        
        System.out.println("\n");
        
        System.out.println("Getting contents out");
        for(int i = 0; i < 26; i++) {
            ch = ob.pop();
            if(ch != 0) {
                System.out.print(ch + " ");
            }
      
        }
        
        System.out.println("\n");
        
        System.out.println("Putting contents in for ob2");
        for(int i = 0; i < 26; i++) {
            ob2.push((char) ('a' + i));
            System.out.print((char) ('a' + i));
        }
        
        
        System.out.println("\n");
        
        System.out.println("Getting contents out for ob2");
        for(int i = 0; i < 26; i++) {
            ch = ob2.pop();
            if(ch != 0) {
                System.out.print(ch + " ");
            }
      
        }
        
        System.out.println("\n");
        
        System.out.println("Putting contents in for ob3");
        for(int i = 0; i < list.length; i++) {
            ob3.push((char) ('a' + i));
            System.out.print((char) ('a' + i));
        }
        
        
        System.out.println("\n");
        
        System.out.println("Getting contents out for ob3");
        for(int i = 0; i < list.length; i++) {
            ch = ob3.pop();
            if(ch != 0) {
                System.out.print(ch + " ");
            }
      
        }
      
        
        
    }
    
    
    
}

class Stack {

    private char a[];
    private int pushloc, poploc;

    Stack(int size) {
        a = new char[size];
        pushloc = poploc = 0;
    }
    
    Stack(Stack ob) {
        a = new char[ob.a.length];
        pushloc = poploc = 0;
        
        for(int i = 0; i < ob.a.length; i++) {
            a[i] = ob.a[i];
        }
    }
    
    Stack(char arr[]) {
        a = new char[arr.length];
        pushloc = poploc = 0;
        
        for(int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }
    }

    void push(char ch) {
        try {
            if (poploc == a.length) {
                throw new StackFullException();
            }
            a[pushloc++] = ch;
            poploc++;
        } catch (StackFullException e) {
            System.out.println(e.ToString());
        }
    }

    char pop() {
        try {
            if (poploc == 0) {
                throw new StackEmptyException();
            }
            pushloc--;
            return a[--poploc];
        } catch (StackEmptyException e) {
            System.out.println(e.ToString());
            return (char) 0;
        }
        
    }

}

class StackFullException extends Exception {
    
    String ToString() {
        return "The stack is full";
    }
}

class StackEmptyException  extends Exception {
    
   String ToString() {
        return "The stack is empty";
    }
}


