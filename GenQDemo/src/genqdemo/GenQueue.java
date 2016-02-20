/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genqdemo;

/**
 *
 * @author jamesfarrell
 */
class GenQueue<T> implements IGenQ<T> {
    private T q[];
    private int putloc, getloc;
    
    public GenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }
    
    public void put(T obj) throws QueueFullException {
        if(putloc==q.length)
            throw new QueueFullException(q.length);
        
        q[putloc++] = obj;
    }
    
    public T get() throws QueueEmptyException {
        if(getloc == putloc)
            throw new QueueEmptyException();
        
        return q[getloc++];
    }
}