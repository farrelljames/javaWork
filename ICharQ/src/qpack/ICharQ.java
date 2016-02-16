/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qpack;


public interface ICharQ {
    
        void put(char ch);
        char get();
        default String reset() { return "Method not yet implemented"; }
}






