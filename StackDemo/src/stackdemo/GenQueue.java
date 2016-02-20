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
public class GenQueue<T> implements IGenStack<T> {
    T a[];
    int pushloc, poploc;
    
    GenQueue(T[] aRef) {
        a = aRef;
        pushloc = poploc = 0;
    }
    
    public void push(T ch) throws QueueFullException {
 
        if (poploc == a.length) {
                throw new QueueFullException(a.length);
            }
            a[pushloc++] = ch;
            poploc++;

    }

    public T pop() throws QueueEmptyException {
 
        if (poploc == 0) {
                throw new QueueEmptyException();
            }
            pushloc--;
            return a[--poploc];

    }
    
}
