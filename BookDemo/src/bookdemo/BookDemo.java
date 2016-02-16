/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookdemo;

/**
 *
 * @author jamesfarrell
 */

public class BookDemo {
    protected String title;
    protected String author;
    protected int pubDate;
    
    public BookDemo(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }
    
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
