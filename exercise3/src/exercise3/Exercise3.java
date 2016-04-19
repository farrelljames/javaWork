/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.Scanner;

/**
 *
 * @author jamesfarrell
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Type in room size: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        String paint[] = {"CheapoMax", "AverageJoes", "DuluxourousPaints"};
        int coverage[] = {220, 210, 170};
        int rem;
        int selection = 0;
        int over[] = new int[3];
        
        if(input > coverage[0]) {
            for(int i = 0; i < 3; i++) {
                
                if(input % coverage[i] == 0){
                    selection = i;
                    break;
                }
                
                while(coverage[i] < input) {
                    int count = 0;
                    coverage[i] = coverage[i] * (count+2);
                }
                over[i] = coverage[i] % input;
            }
            
            rem = over[0];
            
            for(int i = 1; i < 3; i++) {
                if(over[i] < rem) {
                    rem = over[i];
                    selection = i;
                }  
            }
        } 

        System.out.println("You should choose: " + paint[selection]);

    }
    
}
