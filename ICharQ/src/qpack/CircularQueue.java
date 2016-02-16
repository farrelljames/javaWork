/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qpack;

/**
 *
 * @author jamesfarrell
 */
public class CircularQueue implements ICharQ {

    public static void main(String[] args) {
        
    }
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc + 1 == getloc | (putloc == q.length - 1) & (getloc == 0)) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
        if (putloc == q.length) {
            putloc = 0;
        }
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) {
            getloc = 0;
        }
        return ch;
    }
}
