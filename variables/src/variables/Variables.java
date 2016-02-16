/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jamesfarrell
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       StringBuilder builder = new StringBuilder();
       String[] lisr = {"james", "rico", "mendez"};
       byte count = 0;
   
    }
    
    public void simple(String name, int age) {
        System.out.println("my name is " + name + " and you are " + age);
    }
    
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter an even number");
        int number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
        
        Variables check = new Variables();
        
        check.simple("james", 24);
    }
}
