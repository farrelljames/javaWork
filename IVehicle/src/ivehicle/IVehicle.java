/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivehicle;

interface IVehicle {
    
    int range();
    
    double fuelNeeded(int miles);
    
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMPG();
    void setMPG(int m);
    
}
