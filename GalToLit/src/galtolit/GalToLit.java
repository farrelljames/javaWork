/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galtolit;

/**
 *
 * @author jamesfarrell
 */
public class GalToLit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons;
        double litres;
        
        gallons = 10;
        litres = gallons * 3.7854;
        
        System.out.println(gallons + " gallons is " + litres + " litres.");
        
        int list[] = {1,2,4,5};
        int count;
        int total = 0;
        
        
        for(count = 0; count < list.length; count++) {
            total += list[count];
            System.out.println(list[count]);
        }
        
        System.out.println(total);
    }
    
}
