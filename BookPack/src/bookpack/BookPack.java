/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookpack;

/**
 *
 * @author jamesfarrell
 */
public class BookPack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    private String title;
    private String author;
    private int pubDate;

    public BookPack(String t, String a, int d) {
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

class Book {
    
    
    
    BookPack books[] = new BookPack[5];
        
        books[0] = new BookPack("Java: A Beinner's Guide", "Schildt", 2014);
        books[1] = new BookPack("Java: The complete reference", "Schildt", 2014);
        books[2] = new BookPack("The art of Java", "Schildt", 2003);
        books[3] = new BookPack("JHarry POtter", "Rowling", 2001);
        books[4] = new BookPack("J1984", "Oswell", 1946);
        
        for(int i=0; i < books.length; i++) books[i].show();
    
}

