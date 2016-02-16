/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookpack;
import bookdemo.BookDemo;
/**
 *
 * @author jamesfarrell
 */
public class UseBook {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("a", "b", 12, "badman");
        books[1] = new ExtBook("bharry", "b", 12, "penguin");
        books[2] = new ExtBook("c", "b", 12, "dench");
        books[3] = new ExtBook("d", "b", 12, "twotowos");
        books[4] = new ExtBook("fa", "b", 12, " wowow");
        
        for(int i = 0; i < books.length; i++) books[i].show();
    }
  
}

class ExtBook extends BookDemo {
    private String publisher;
    
    public ExtBook(String t, String a, int d, String p) {
        super(t,a,d);
        publisher = p;
    }
    
    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }
    
    public String getPublisher() { return publisher; }
    public void setPublisher(String p) { publisher = p; }
    
    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }
    public String getAuthor() {  return author; }
    public void setAuthor(String a) { author = a; }
    public int getPubDate() { return pubDate; }
    public void setpubDate(int p) { pubDate = p; }
    
}
