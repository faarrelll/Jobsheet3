/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author ASUS
 */
public class Truck {
    //diclas truck memiliki 3 variabel
    public int cadence,gear,speed;
    
    //dan memiliki satu konstruktor
    public Truck(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    
    //memiliki 4 method
    public void setCadense(int newValue){
        cadence = newValue;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void applybrake(int decrement){
        speed = decrement;
    }
    public void speedUp(int increment){
        speed = increment;
    }
    
    
    
}
