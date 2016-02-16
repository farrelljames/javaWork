/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypot;
import java.util.Scanner;
/**
 *
 * @author jamesfarrell
 */
public class Hypot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of first side");
        double fSide = sc.nextDouble();
        System.out.println("Enter length of second side");
        double SSide = sc.nextDouble();
        
        double result = Math.sqrt(Math.pow(fSide, 2) + Math.pow(SSide, 2));
        System.out.println("The hypotenuse is: " + result);
        
    }
    
}
