/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truckdemo;

/**
 *
 * @author jamesfarrell
 */
public class TruckDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;
        
        gallons = semi.fuelNeeded(dist);
        
        System.out.println("Semi can carry " + semi.getCargo() + 
                           "pounds.");
        System.out.println("To go " + dist + " miles semi needs " + 
                            gallons + " gallons of fuel.\n");
        
        gallons = pickup.fuelNeeded(dist);
        
        System.out.println("Pickup can carry " + pickup.getCargo() + 
                           "pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + 
                            gallons + " gallons of fuel.\n");
    }
    
}

class Vehicle {

    private int passengers;
    private int fuelcap;
    private int mpg;

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
    
    int getPassengers() { return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMPG() { return mpg; }
    void setMPG(int m) { mpg = m; }
}

class Truck extends Vehicle {
    private int cargocap;
    
    Truck(int p, int f, int m, int c) {
        super(p,f,m);
        cargocap = c;
    }
    
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}
