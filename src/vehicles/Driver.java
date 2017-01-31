/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author CReynolds17
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("In driver main");
        
        promptUser();
    }
    
    public static void promptUser(){
        System.out.println("In prompt user");
        
        //create and object of type vehicle,l and store it in the variable myVehicle
        Vehicle myVehicle = new Vehicle();
        
        //set the attributes in myVehicle object
        myVehicle.setGallonsOfGas(12.0);
        myVehicle.setMpg(20);
        myVehicle.setOdometer(10000);
        
        //move the vehicle 
        myVehicle.go(40);
                
    }
    
}