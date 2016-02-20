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
public interface IGenStack<T> {
    
    T pop() throws QueueEmptyException;
    
    void push(T ch) throws QueueFullException;
    
}
