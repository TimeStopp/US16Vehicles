/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author creynolds17
 */
public class Vehicle {
    
    private double gallonsOfGas;
    private int mpg;
    private int odometer; 

    
    public void go(int distance) {
        
    }
    /**
     * @return the gallonsOfGas
     */
    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    /**
     * @param gallonsOfGas the gallonsOfGas to set
     */
    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    /**
     * @return the mpg
     */
    public int getMpg() {
        return mpg;
    }

    /**
     * @param mpg the mpg to set
     */
    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    /**
     * @return the odometer
     */
    public int getOdometer() {
        return odometer;
    }

    /**
     * @param odometer the odometer to set
     */
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    
}
