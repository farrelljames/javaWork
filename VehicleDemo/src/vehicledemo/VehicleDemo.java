/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicledemo;

/**
 *
 * @author jamesfarrell
 */
public class VehicleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
                
        int range1, range2, dist = 252;
        
        System.out.println("To go " + dist + " miles minivan needs " +
                           minivan.fuelNeeded(dist) + " gallons of fuel");
        
        System.out.println("To go " + dist + " miles sportscar needs " +
                           sportscar.fuelNeeded(dist) + " gallons of fuel");
    }
    
}

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    
    int range() {
        return fuelcap * mpg;
    }
    
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
